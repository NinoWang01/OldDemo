package com.pb.android_107_4_04_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class SecondActivity extends Activity implements OnClickListener {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		button = (Button) findViewById(R.id.buttton_uid);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttton_uid:
			// 要给第一个activity返回值
			Intent intent = new Intent();
			intent.putExtra("SecondActivity", "法国航空和工具栏取463456");
			// 方法
			setResult(1, intent);
			//
			finish();
			break;
		default:
			break;
		}
	}
}
