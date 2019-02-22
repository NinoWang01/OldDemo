package com.pb.android_107_13_test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//

		Log.d("MyBroadcastReceiver", "自定义广播接收者，接收自定义的广播");
		Log.d("MyBroadcastReceiver", intent.getAction());

	}

}
