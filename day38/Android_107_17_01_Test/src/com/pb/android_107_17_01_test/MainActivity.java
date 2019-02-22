package com.pb.android_107_17_01_test;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;


public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 Volley_Get();
//		Volley_Post();
	}
	@Override
	protected void onStop() {
		super.onStop();
		// 退出应用的时候
		MyApplication.getHttpQueue().cancelAll("abcGet");
	}
	private void Volley_Get() {
		String url = "http://m2.qiushibaike.com/article/list/suggest?page=2";
		StringRequest request = new StringRequest(Method.GET, url,
				new Listener<String>() {
					@Override
					public void onResponse(String arg0) {
						Toast.makeText(MainActivity.this, arg0.toString(),
								Toast.LENGTH_LONG).show();
					}
				}, new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError arg0) {
						Toast.makeText(MainActivity.this, "网络请求失败",
								Toast.LENGTH_LONG).show();
					}
				});
		// 队请求设置一个tag(用于取消请求用)
		request.setTag("abcGet");
		// 最后一步将请求添加到队列中
		MyApplication.getHttpQueue().add(request);
	}
	private void Volley_Post() {
		// String url = "http://v.juhe.cn/weather/index?format=2&";http://m2.qiushibaike.com/article/list/suggest?page=1
		String url = "http://m2.qiushibaike.com/article/list/suggest?page=1";
		StringRequest request = new StringRequest(Method.POST, url,
				new Listener<String>() {
					@Override
					public void onResponse(String arg0) {
						Toast.makeText(MainActivity.this, arg0.toString(),
								Toast.LENGTH_LONG).show();
					}
				}, new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError arg0) {
						Toast.makeText(MainActivity.this, "网络请求失败",
								Toast.LENGTH_LONG).show();
					}
				});
		// 为请求设置一个标签
		request.setTag("abcPost");
		// 将请求添加到队列中去
		MyApplication.getHttpQueue().add(request);
	}
}
