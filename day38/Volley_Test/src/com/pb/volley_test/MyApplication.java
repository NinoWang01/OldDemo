package com.pb.volley_test;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import android.app.Application;
public class MyApplication extends Application {
	public static RequestQueue queue;
	@Override
	public void onCreate() {
		super.onCreate();
		// 创建一个队列
		queue = Volley.newRequestQueue(getApplicationContext());
	}
	// 暴漏一个方法返回请求队列
	public static RequestQueue getHttpQueue() {
		return queue;
	}
}
