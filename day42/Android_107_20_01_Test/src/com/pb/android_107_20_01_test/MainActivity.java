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
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	public ListView list_view;
	public List<Map<String, String>> totallist = null;

	public MyAdapter adapter = null;
	// json请求地址
	public String stringUrl = "http://m2.qiushibaike.com/article/list/suggest?";
	public ByteArrayOutputStream baos;
	public BufferedInputStream bis;

	// 声明一个变量，作为滑动事件时页面请求参数page值的改变
	public int page_change = 1;
	// 滑动事件一个布尔类型变量
	public boolean isHuaDong = false;
	// 进度条
	public LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件'
		list_view = (ListView) findViewById(R.id.list_view_id);
		layout = (LinearLayout) findViewById(R.id.linear_layout_id);

		inintMyAsyncTast();

		// 创建集合实例
		totallist = new ArrayList<Map<String, String>>();
		// 创建适配器
		adapter = new MyAdapter(totallist, this);
		list_view.setAdapter(adapter);
		// listview监听
		list_view.setOnScrollListener(new OnScrollListener() {
			// 当前页面状态的改变
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				if (isHuaDong) {
					// 页面变量++
					page_change++;
					layout.setVisibility(View.VISIBLE);
					// 做一次网络请求
					// new MyAsyncTask(MainActivity.this).execute(stringUrl
					// + page_change);
				} else {
					layout.setVisibility(View.GONE);
				}
			}

			// 滑动监听，第二页的第一条数据要从那一条开始显示
			@Override
			public void onScroll(AbsListView view, int firstVisibleItem,
					int visibleItemCount, int totalItemCount) {
				isHuaDong = ((firstVisibleItem + visibleItemCount) == totalItemCount);
			}
		});
	}

	private void inintMyAsyncTast() {
		// 创建异步的实例,得到了解析的数据//只传了一个URL
		new MyAsyncTask(this).execute(stringUrl + page_change);

	}

	public void layoutOnClick(View v) {
		switch (v.getId()) {
		case R.id.linear_layout_id:
			// 页面变量++
			page_change++;
			// 做一次网络请求
			new MyAsyncTask(MainActivity.this).execute(stringUrl + page_change);
			layout.setVisibility(View.GONE);
			break;
		default:
			break;
		}
	}

	// 异步
	class MyAsyncTask extends AsyncTask<String, Void, byte[]> {

		public Context context;
		public ProgressDialog pro;// 声明一个ProgressDialog

		// 构造方法，在构造方法中添加
		public MyAsyncTask(Context context) {
			this.context = context;
			// 处理异步进度条对话框
			pro = new ProgressDialog(context);
			// 进度条对话框的图标
			pro.setIcon(R.drawable.ic_launcher);
			// 设置标题
			pro.setTitle("下载进度");
			// 信息描述
			pro.setMessage(" 正在下载文件。。。");
		}
		//异步可以解决一些耗时的操作
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
					int d = 0;
					byte[] buffer = new byte[1024 * 8];
					// 循环读取
					while ((a = bis.read(buffer)) != -1) {
						baos.write(buffer, 0, a);
						// 保证读写的完成
						baos.flush();
						d += a;
						Log.d("==========================================", d
								+ "");
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
					e.printStackTrace();
				}
			}
			return null;
		}

		// 业务处理,处理返回的Json字符串
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

					// 把数据放入list集合当中去
					totallist.addAll(list);
					// 刷新适配器
					adapter.notifyDataSetChanged();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				layout.setVisibility(View.GONE);
				// 关闭对话框
				pro.dismiss();
			}
		}
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			// 显示对话框
			pro.show();
		}
 
		@Override
		protected void onProgressUpdate(Void... values) {
			super.onProgressUpdate(values);
			// 更新的是进度条对话框的
			
		}
	}
}
