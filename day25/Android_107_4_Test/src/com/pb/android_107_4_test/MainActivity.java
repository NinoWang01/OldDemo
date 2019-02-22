package com.pb.android_107_4_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 数据初始化的方法法
		init();
		// 让按钮去监听
		button.setOnClickListener(this);

		// //实现监听
		// button.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		//
		// }
		// });

	}

	private void init() {
		// 实例化
		button = (Button) findViewById(R.id.button_id_1);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_id_1:
			// 隐式启动调用手机照相机
			Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
			// 启动新的activity
			startActivity(intent);
			break;

		default:
			break;
		}

	}

}
