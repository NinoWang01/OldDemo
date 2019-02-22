package com.pb.android_107_18_01_test;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
 

//请求方式的一个工具类
public class RequestUtils {
	// 先创建一个asyncHttpClient的实例
	public static AsyncHttpClient client = new AsyncHttpClient();

	/*
	 * get请求
	 */
	public static void clientGet(String url, InternetCallBack cb) {
		// 请求
		client.get(url, cb);
	}
	// post请求
	public static void clientPost(String url, RequestParams rps,
			InternetCallBack cb) {
		client.post(url, rps, cb);
	}
}
