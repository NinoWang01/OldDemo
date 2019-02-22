package com.pb.android_107_9_test;

import android.os.Bundle;
import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;
public class MainActivity extends Activity implements OnClickListener {
	public Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 时间对话框的监听
			OnTimeSetListener otsl = new TimePickerDialog.OnTimeSetListener() {
				@Override
				public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
					// 处理时间对话框的所有的逻辑
				}
			};
			// 获得时间对话框的实例
			TimePickerDialog tpd = new TimePickerDialog(this, otsl, 0, 0, true);
			// 添加对话框的标题
			tpd.setIcon(R.drawable.ic_launcher);
			// 添加标题
			tpd.setMessage("这个是时间对话框");
			// 设置对话的显示
			tpd.show();
			break;
		default:
			break;
		}

	}
}
