package com.pb.android_107_13_01_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver_03 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.d("MyBroadcastReceiver_03", "自定义广播接收者03接收到了广播");
	}

}
