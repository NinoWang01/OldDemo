package com.pb.android_107_21_test.tools;

import java.io.BufferedInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.alibaba.fastjson.JSON;

import com.pb.android_107_21_test.bean.ItemEntity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

//异步类，做网络请求的耗时操作
public class MyAsyncTask extends AsyncTask<String, Void, byte[]> {

	public Context context;
	public Handler handler;
	public ByteArrayOutputStream baos;
	public BufferedInputStream bis;

	// 构造方法
	public MyAsyncTask(Context context, Handler handler) {
		this.context = context;
		this.handler = handler;
	}

	@Override
	protected byte[] doInBackground(String... params) {
		try {
			// 网络请求
			URL url = new URL(params[0]);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
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
					Log.d("==========================================", d + "");
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

	@Override
	protected void onPostExecute(byte[] result) {
		super.onPostExecute(result);
		// 判断result
		if (result != null) {
			try {
				String data = new String(result, "utf-8");
				// 解析
				JSONObject jsonObject = new JSONObject(data);
				JSONArray array = jsonObject.optJSONArray("items");
				// 把json数据解析成一个集合
				List<ItemEntity> list = JSON.parseArray(array.toString(),
						ItemEntity.class);
				// 解析完之后把数据打包成消息发送给主线程
				Message msg = new Message();
				// Message msg=handler.obtainMessage();
				// Message msg=Message.obtain();
				// 打包消息
				msg.obj = list;
				// 发送消息
				handler.sendMessage(msg);
				// msg.sendToTarget();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			Toast.makeText(context, "网络请求失败", Toast.LENGTH_LONG).show();
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
