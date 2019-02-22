package com.pb.android_107_13_01_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver_01 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//
		Log.d("MyBroadcastReceiver_01", "自定义广播接收者01接收到了广播");

	}

}
