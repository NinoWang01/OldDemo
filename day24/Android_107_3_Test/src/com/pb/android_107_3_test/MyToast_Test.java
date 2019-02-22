package com.pb.android_107_3_test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MyToast_Test extends Activity implements OnClickListener {

	private Context context;
	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toast);
		// 实例化
		button1 = (Button) findViewById(R.id.button_toast_id);
		// 监听
		button1.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_toast_id:
			// 上下文对象，当前类的对象（1、this 同 MyToast_Test.this 2、context
			// 3、getApplicationContext() ）
			Toast.makeText(getApplicationContext(), "吐丝内容23463456阿萨德刚",
					Toast.LENGTH_LONG).show();

			break;

		default:
			break;
		}

	}

}
