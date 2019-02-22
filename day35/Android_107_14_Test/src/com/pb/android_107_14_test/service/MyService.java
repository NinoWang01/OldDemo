package com.pb.android_107_14_test.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
 

	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("-----------------------MyService", "onCreate");
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i("-----------------------MyService", "onStartCommand");
		return super.onStartCommand(intent, flags, startId);

	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i("-----------------------MyService", "onDestroy");
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	} 

 

}
