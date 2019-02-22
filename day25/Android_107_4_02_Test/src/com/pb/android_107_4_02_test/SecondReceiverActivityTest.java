package com.pb.android_107_4_02_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondReceiverActivityTest extends Activity {

	private TextView text_View;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_page);
		// 现获得Intent的实例
		Intent intent = getIntent();

		String ss = intent.getStringExtra("one");

		// 放到第二个页面上的空间TextView上
		text_View = (TextView) findViewById(R.id.text_view_id_1);

		text_View.setText(ss);

	}

}
