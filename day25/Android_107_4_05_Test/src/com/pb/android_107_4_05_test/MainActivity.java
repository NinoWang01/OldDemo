package com.pb.android_107_4_05_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private TextView text_View;
	private CheckBox check_box_1, check_box_2;
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text_View = (TextView) findViewById(R.id.textView_id);
		check_box_1 = (CheckBox) findViewById(R.id.check_box_id_1);
		check_box_1.setOnClickListener(this);
		check_box_2 = (CheckBox) findViewById(R.id.check_box_id_2);
		check_box_2.setOnClickListener(this);
		button = (Button) findViewById(R.id.button_dianji_id);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_dianji_id:
			check_box_1.setChecked(false);
			check_box_2.setChecked(false);
			text_View.setText("你未选择性别");
			break;
		case R.id.check_box_id_1:
			check_box_2.setChecked(false);
			if (check_box_1.isChecked()) {
				text_View.setText("你选择的性别是" + check_box_1.getText().toString());
			} else {
				text_View.setText("你未选择性别");
			}
			break;
		case R.id.check_box_id_2:
			check_box_1.setChecked(false);
			if (check_box_2.isChecked()) {
				text_View.setText("你选择的性别是" + check_box_2.getText().toString());
			} else {
				text_View.setText("你未选择性别");
			}
			break;
		default:
			break;
		}
	}

}
