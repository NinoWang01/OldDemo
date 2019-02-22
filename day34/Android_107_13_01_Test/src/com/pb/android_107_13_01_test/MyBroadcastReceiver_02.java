package com.pb.android_107_13_01_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver_02 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.d("MyBroadcastReceiver_02", "自定义广播接收者02接收到了广播");
		// 拦截广播
		abortBroadcast();
		Log.d("MyBroadcastReceiver_02", "自定义广播接收者02接收到了广播,并把它之后的广播给拦截了");

	}

}
