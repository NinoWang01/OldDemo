package com.pb.android_107_3_test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivityLogToast_Test extends Activity {
	public static final String TAG = "MyActivityLogToast_Test";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 找到相应的布局文件
		setContentView(R.layout.show);
//
//		Log.v(TAG, "verbose");// 静态方法
//		Log.d(TAG, "debug");
//		Log.i(TAG, "info");
//		Log.w(TAG, "warn");
//		Log.e(TAG, "error");
		init();
		initData();

	}

	private void initData() {
		// TODO Auto-generated method stub
		
	}

	private void init() {
		 
		
	}

}
