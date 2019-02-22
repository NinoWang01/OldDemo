package com.pb.android_107_4_03_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BundleActivity extends Activity {
	private TextView text_view_1, text_view_2, text_view_3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bundle_show);
		text_view_1 = (TextView) findViewById(R.id.text_view_1);
		text_view_2 = (TextView) findViewById(R.id.text_view_2);
		text_view_3 = (TextView) findViewById(R.id.text_view_3);

		// 获得intent实例
		Intent intent = getIntent();
		// 获得bundle的实例
		Bundle bundle = intent.getExtras();
		// 获取bundle中的值
		String str = bundle.getString("name");
		int nianling = bundle.getInt("age");
		char xingbie = bundle.getChar("sex");

		text_view_1.setText(String.valueOf(xingbie));
		text_view_2.setText(String.valueOf(nianling));
		text_view_3.setText(str);

	}

}
