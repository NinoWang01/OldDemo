package com.pb.android_107_17_test;

import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	// 三个组件
	public ImageView image_view;
	public EditText edit_text;
	public Button button1;
	// 创建两个常量，分别代表请求服务器成功和失败的两个常量
	public static final int CHANGE_UI = 1;// 成功
	public static final int ERROR = 2;// 失败

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化三个控件
		image_view = (ImageView) findViewById(R.id.image_view_id);
		edit_text = (EditText) findViewById(R.id.edit_text_id);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);

	}

	// 作为主线程处理子线程发送过来的消息
	public Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {

			switch (msg.what) {
			// 成功
			case CHANGE_UI:
				// 转化obj携带的数据,又转化成了一张图片
				Bitmap bitmap = (Bitmap) msg.obj;
				// 把图片设置到ImageView 当中去
				image_view.setImageBitmap(bitmap);
				break;
			case ERROR:
				Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_LONG)
						.show();
				break;
			default:
				break;
			}
		}
	};

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 输入网址
			final String str = edit_text.getText().toString().trim();
			// 判断输入的路径是否为空
			if (TextUtils.isEmpty(str)) {
				// 如果是空，告诉用户重新输入
				Toast.makeText(this, "网址空，重新输入", Toast.LENGTH_LONG).show();
			} else {
				// 网址不为空的时候，需要网络请求，开启子线程
				new Thread() {

					@Override
					public void run() {

						// 定义一个方法，定义一个函数
						getImageViewHttpClient(str);
					}
				}.start();

			}

			break;

		default:
			break;
		}

	}

	// 整个网络请求业务处理
	public void getImageViewHttpClient(String str) {
		try {
			// 获得为HttpClient实例
			HttpClient httpClient = new DefaultHttpClient();
			// 获得当前网络的请求方式
			HttpGet httpGet = new HttpGet(str);
			// 获得一个请求响应的对象
			HttpResponse response = httpClient.execute(httpGet);
			// 现获得返回状态码
			int code = response.getStatusLine().getStatusCode();
			// 判断请求是否成功
			if (code == 200) {
				// 如果要获得HttpClient的输入流，通过的是entity
				HttpEntity entity = response.getEntity();
				// 获得输入流
				InputStream is = entity.getContent();
				// 一张图片
				Bitmap bitmap = BitmapFactory.decodeStream(is);
				// 告诉主线程更新UI界面
				Message msg = new Message();
				msg.what = CHANGE_UI;
				// 携带一个参数
				msg.obj = bitmap;
				// 发送消息
				handler.sendMessage(msg);
			} else {
				// 告诉主线程更新UI界面
				Message msg = new Message();
				msg.what = ERROR;
				// 发送消息
				handler.sendMessage(msg);

			}

		} catch (Exception e) {
			// 告诉主线程更新UI界面
			Message msg = new Message();
			msg.what = ERROR;
			// 发送消息
			handler.sendMessage(msg);
		}
	}

}
