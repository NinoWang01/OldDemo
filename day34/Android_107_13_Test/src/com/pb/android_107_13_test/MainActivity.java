package com.pb.android_107_13_test;

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

	public void sendBroadcast(View v) {

		// 创建意图对象
		Intent intent = new Intent();
		// 让意图携带广播
		intent.setAction("www.itcast.dasdf");

		// 发送广播
		sendBroadcast(intent);


Intent intent = new Intent("MyReceiver_Action");
// 可通过Intent携带消息
intent.putExtra("msg", "发送广播");
// 发送广播消息
sendBroadcast(intent);
	}

}
