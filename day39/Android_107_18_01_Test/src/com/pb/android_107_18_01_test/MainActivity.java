package com.pb.android_107_18_01_test;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;

public class MainActivity extends Activity {
	// http://m2.qiushibaike.com/article/list/suggest?page=1
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// get请求方法
		asyncGet();
		// post请求方法
		asyncPost();

	}

	// 做具体的网络请求实现
	private void asyncGet() {
		// 现获得
		AsyncHttpClient client = new AsyncHttpClient();
		// 请求地址
		String url = "http://m2.qiushibaike.com/article/list/suggest?page=1";
		// 直接请求
		client.get(url, new AsyncHttpResponseHandler() {
			@Override
			public void onFailure(Throwable arg0) {
				Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_LONG)
						.show();
			}

			@Override
			public void onSuccess(String arg0) {
				Toast.makeText(MainActivity.this, arg0, Toast.LENGTH_LONG)
						.show();
			}
		});

	}

	// post网络请求
	private void asyncPost() {
		// 请求地址
		String url = "http://apis.juhe.cn/plan/city";
		// 得到RequestParams
		RequestParams params = new RequestParams();
		params.put("dtype", "18801071182");
		params.put("AppKey", "82e01beaceee4940cdd1597fb8ffbae6");
		RequestUtils.clientPost(url, params, new InternetCallBack() {
			@Override
			public void onMySuccess(String arg0) {
				Toast.makeText(MainActivity.this, arg0, Toast.LENGTH_LONG)
						.show();

			}

			@Override
			public void onMyFailure(Throwable arg0) {
				Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_LONG)
						.show();

			}
		});

	}

}
