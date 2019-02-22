package com.pb.android_107_4_02_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button button_1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button_1 = (Button) findViewById(R.id.button1);
		// 按钮的监听
		button_1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 启动另一个activity，并传值
			Intent intent = new Intent(MainActivity.this,
					SecondReceiverActivityTest.class);
			// intent类似于map集合
			String str = "我是从MainActivity过来的数据";

			intent.putExtra("one", str);
			// 再去启动
			startActivity(intent);

			break;

		default:
			break;
		}

	}

}
