package com.pb.android_107_18_01_test;

import com.loopj.android.http.AsyncHttpResponseHandler;

 

//监听网络请求成功和失败的
public abstract class InternetCallBack extends AsyncHttpResponseHandler {

	// 开始请求的
	@Override
	public void onStart() {

		super.onStart();

	}

	// 成功
	@Override
	public void onSuccess(String arg0) {
		onMySuccess(arg0);
		super.onSuccess(arg0);
	}

	// 失败
	@Override
	public void onFailure(Throwable arg0, String arg1) {
		onMyFailure(arg0);
		super.onFailure(arg0, arg1);
	}

	public abstract void onMySuccess(String arg0);

	public abstract void onMyFailure(Throwable arg0);

}
