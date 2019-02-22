package com.pb.android_107_13_01_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void send(View v) {

		Intent intent = new Intent();
		// 发送广播
		intent.setAction("www.itcast.d");

		sendOrderedBroadcast(intent, null);

	}

}
