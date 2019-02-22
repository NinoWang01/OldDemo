package com.pb.android_107_14_01_test.service;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
public class MyBinderService extends Service {
	
	
	// 内部类，为了创建一个实例，调用服务中的其他方法用的，
	public class MyBinder extends Binder {
		// 调用服务中的方法
		public void callserviceHao() {
			serviceHao();
		}
	}
	@Override
	public IBinder onBind(Intent intent) {
		Log.i("=====================MyBinderService", "onBind");
		return new MyBinder();
	}
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("=====================MyBinderService", "onCreate");
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i("=====================MyBinderService", "onDestroy");
	}
	@Override
	public boolean onUnbind(Intent intent) {
		Log.i("=====================MyBinderService", "onUnbind");
		return super.onUnbind(intent);
	}
	// 自定义方法
	public void serviceHao() {
		Log.i("++++++++++++++++++++++++++++++++++++++++++++MyBinderService", "serviceHao");
	}

}
