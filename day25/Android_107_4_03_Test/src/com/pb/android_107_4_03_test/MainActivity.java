package com.pb.android_107_4_03_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	public Button button, button_11;
	private TextView textView_11;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		button = (Button) findViewById(R.id.main_button_id);
		// 监听
		button.setOnClickListener(this);
		button_11 = (Button) findViewById(R.id.button1);
		button_11.setOnClickListener(this);

		textView_11 = (TextView) findViewById(R.id.main_text_view_id);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_button_id:
			// 启动那个页面
			Intent intent = new Intent(MainActivity.this, BundleActivity.class);
			// 创建一个bundle对象
			Bundle bundle = new Bundle();
			// bundle本身类似map
			bundle.putString("name", "张三丰");
			// 传年龄
			bundle.putInt("age", 120);
			// 传性别
			bundle.putChar("sex", '男');
			// 把bundle给intent,让它携带
			intent.putExtras(bundle);
			// 启动
			startActivity(intent);
			break;

		case R.id.button1:

			// 启动那个页面
			Intent intent1 = new Intent(MainActivity.this, ThridActivity.class);
			// startActivity(intent1);
			// 换一个方法，让被启动的activity有返回
			startActivityForResult(intent1, 1);

			break;

		default:
			break;
		}

	}

	// 重写activity的另一个方法,专门处理带有返回activity启动
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		// 先判断requestCode是不是MainActivity传过去的1
		if (requestCode == 1) {
			// 拿到返回值
			String ss = data.getStringExtra("ThridActivity");
			textView_11.setText(ss);

		}

		super.onActivityResult(requestCode, resultCode, data);
	}

}
