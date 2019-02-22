package com.pb.android_107_12_05_test;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public EditText edit;
	public Button button;
	public SharedPreferences ps;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		edit = (EditText) findViewById(R.id.edit_text_id);
		button = (Button) findViewById(R.id.button1);
		ps = getSharedPreferences("config", MODE_PRIVATE);
		edit.setText(ps.getString("ipnumber", ""));

	}

	public void onClid(View v) {
		// 获得用户输入的设置IP号
		String str = edit.getText().toString().trim();
		Editor et = ps.edit();
		et.putString("ipnumber", str);
		// 提交
		et.commit();
		Toast.makeText(MainActivity.this, "设置IP拨号成功", Toast.LENGTH_LONG).show();

	}

}
