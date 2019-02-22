package com.pb.android_107_20_01_test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import java.util.Map;

import com.pb.android_107_20_01_test.adapter.MyAdapter;
import com.pb.android_107_20_01_test.tools.Tools;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends Activity {

	public ListView list_view;
	public List<Map<String, String>> totallist = null;
	public LinearLayout layout;
	public MyAdapter adapter = null;
	// json请求地址
	public String stringUrl = "http://m2.qiushibaike.com/article/list/suggest?page=1";

	public ByteArrayOutputStream baos;
	public BufferedInputStream bis;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件'
		list_view = (ListView) findViewById(R.id.list_view_id);
		layout = (LinearLayout) findViewById(R.id.linear_layout_id);
		//创建异步的实例,得到了解析的数据
		new MyAsyncTask(this).execute(stringUrl);
		//创建集合实例
		totallist=new ArrayList<Map<String,String>>();
		//创建适配器
		adapter=new MyAdapter(totallist, this);
		list_view.setAdapter(adapter);

	}

	class MyAsyncTask extends AsyncTask<String, Void, byte[]> {

		public Context context;

		public MyAsyncTask(Context context) {
			this.context = context;

		}

		@Override
		protected byte[] doInBackground(String... params) {
			try {
				// 网络请求
				URL url = new URL(params[0]);
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				// 缓存
				baos = new ByteArrayOutputStream();
				// 网络请求是否成功
				if (conn.getResponseCode() == 200) {
					// 获得输入流
					bis = new BufferedInputStream(conn.getInputStream());

					// 流的读写
					int a = 0;
					byte[] buffer = new byte[1024 * 8];
					// 循环读取
					while ((a = bis.read(buffer)) != -1) {
						baos.write(buffer, 0, a);
						// 保证读写的完成
						baos.flush();
					}

					return baos.toByteArray();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (baos != null) {
						baos.close();
					}
					if (bis != null) {
						bis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return null;
		}

		//业务处理,处理返回的Jason字符串
		@Override
		protected void onPostExecute(byte[] result) {
			// 先判断，返回结果为不为空
			if (result != null) {
				// 先把result转换成String
				try {
					String data = new String(result, "utf-8");
					// 调用解析工具去解析
					List<Map<String, String>> list = Tools
							.jsonStringToList(data);
					
					//把数据放入list集合当中去
					totallist.addAll(list);
					//刷新适配器
					adapter.notifyDataSetChanged();
					
					

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		@Override
		protected void onProgressUpdate(Void... values) {
			super.onProgressUpdate(values);
		}

	}

}
