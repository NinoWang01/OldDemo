package com.pb.android_107_14_01_test;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pb.android_107_14_01_test.service.MyBinderService;
import com.pb.android_107_14_01_test.service.MyBinderService.MyBinder;

public class MainActivity extends Activity implements OnClickListener {

	public Button button1, button2;
	public MyBinder binder;
	public MyServiceConn conn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);
	}

	//
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 绑定服务
		case R.id.button1:
			// 判断MyServiceConn的实例是否为空间
			if (conn == null) {
				// 创建MyServiceConn的一个实例
				conn = new MyServiceConn();
			}
			// 创建Intent
			Intent intent = new Intent(this, MyBinderService.class);
			/*
			 * 启动服务 service:intent,你要启动的服务是谁 conn:是否连接服务成功
			 * flags:如果服务不存在，就创建一个新的服务
			 */
			bindService(intent, conn, BIND_AUTO_CREATE);
			break;
		// 关闭服务（即解除绑定）
		case R.id.button2:
			// 判断MyServiceConn的实例是否为空
			if (conn != null) {
				// 解除
				unbindService(conn);
				// 要求把类似于监听服务的MyServiceConn的实例给清空
				conn = null;
			}
			break;
		case R.id.button3:
			// 调用服务器中的 方法
			binder.callserviceHao();
		default:
			break;
		}
	}
	// 绑定式启动服务类似于监听
	public class MyServiceConn implements ServiceConnection {
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// 获得一个binder实例
			binder = (MyBinder) service;
			Log.i("=====================MainActivity",
					"服务绑定成功，内存地址：" + binder.toString());
		}
		@Override
		public void onServiceDisconnected(ComponentName name) {
			Log.i("=====================MainActivity", "服务绑定失败了!!!");

		}

	}

}
