package com.pb.android_107_14_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pb.android_107_14_test.service.MyService;

public class MainActivity extends Activity implements OnClickListener {

	public Button button1, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);
	}

	// 非绑定式的服务启动的生命周期
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 开启服务
		case R.id.button1:

			Intent intent = new Intent(this, MyService.class);
			// 启动服务
			startService(intent);
			break;
		// 关闭服务
		case R.id.button2:
			Intent intent2 = new Intent(this, MyService.class);
			// 关闭服务
			stopService(intent2);
			break;
		default:
			break;
		}

	}

}
