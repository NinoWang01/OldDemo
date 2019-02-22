package com.pb.android_107_12_04_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "我是静态注册的广播。。。。。。。。", Toast.LENGTH_LONG).show();

	}

}
