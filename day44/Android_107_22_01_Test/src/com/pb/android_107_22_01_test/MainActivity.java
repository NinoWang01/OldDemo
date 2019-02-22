package com.pb.android_107_22_01_test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	// 创建一个方法
	public void onClickButton(View v) {
		// 在activity启动服务
		Intent intent = new Intent(MainActivity.this, MusicService.class);
		// 创建一个
		int a = 0;
		switch (v.getId()) {
		// 播放
		case R.id.button1:
			a = 1;
			break;
		// 暂停
		case R.id.button2:
			a = 2;
			break;
		// 停止
		case R.id.button3:
			a = 3;
			break;
		default:
			break;
		}
		// 传值
		Bundle bundle = new Bundle();// 用bundle传值
		bundle.putInt("type", a);
		intent.putExtras(bundle);
		// 启动服务
		startService(intent);

	}

}
