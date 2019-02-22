package com.pb.android_107_12_03_test;

import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	public MyBroadcastReceiver receiver;
	public IntentFilter filter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 过滤器对象
		filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
		// 接收器对象
		receiver = new MyBroadcastReceiver();
		// 动态注册广播
		registerReceiver(receiver, filter);

	}

	@Override
	protected void onDestroy() {

		super.onDestroy();
		unregisterReceiver(receiver);
	}

	public class MyBroadcastReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {

			// 广播处理
			Toast.makeText(MainActivity.this, "网络变化", Toast.LENGTH_LONG).show();

		}

	}

}
