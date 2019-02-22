package com.pb.android_107__5_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class MainActivity extends Activity implements OnClickListener {

	// 创建
	private RadioButton button_1, button_2, button_3, button_4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button_1 = (RadioButton) findViewById(R.id.radio_button_id_1);
		button_1.setOnClickListener(this);
		button_2 = (RadioButton) findViewById(R.id.radio_button_id_2);
		button_3 = (RadioButton) findViewById(R.id.radio_button_id_3);
		button_4 = (RadioButton) findViewById(R.id.radio_button_id_4);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.radio_button_id_1:

			Intent intent = new Intent(MainActivity.this, NewActivity.class);
			startActivity(intent);

			break;
		case R.id.radio_button_id_2:

			break;
		case R.id.radio_button_id_3:

			break;
		case R.id.radio_button_id_4:

			break;
		default:
			break;
		}

	}

}
