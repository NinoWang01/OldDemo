package com.pb.android_107_4_04_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity implements OnClickListener {
	private TextView textView_a;
	public Button button_b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		textView_a = (TextView) findViewById(R.id.main_text_id);
		button_b = (Button) findViewById(R.id.main_id);
		button_b.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_id:
			// 启动页面
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			// startActivity(intent);
			startActivityForResult(intent, 1);
			break;
		default:
			break;
		}
	}
	// 返回的值如何处理
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// 判断
		if (requestCode == 1) {
			// 得到返回的值
			String str = data.getStringExtra("SecondActivity");
			textView_a.setText(str);
		}
	}
}
