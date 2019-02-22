package com.pb.android_107_3_test;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	// 声明一个按钮
	private Button button_1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		button_1 = (Button) findViewById(R.id.button1);
		//添加按钮的监听
		button_1.setOnClickListener(this);
	}
	// 这个是实现了接口的一个监听方法法
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Log.d("MainActivity", "当你点击按钮的时候程序有没有走到这一块");
			//业务逻辑处理
			// 吐丝
			Toast.makeText(MainActivity.this, "按钮被点击了", Toast.LENGTH_LONG)
					.show();
			break;
		default:
			break;
		}
	}
	// // 创建按钮的监听方法
	// public void chengkOnClick(View v) {
	// switch (v.getId()) {
	// case R.id.button1:
	// // 吐丝
	// Toast.makeText(MainActivity.this, "按钮被点击了", Toast.LENGTH_LONG)
	// .show();
	// break;
	// default:
	// break;
	// }
	//
	// }

}
