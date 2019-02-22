package com.pb.android_107_8_01_test;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
public class MainActivity extends Activity implements OnClickListener {
	public Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button_view_id);
		button.setOnClickListener(this);
		//

	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_view_id:
			OnDateSetListener listener = new OnDateSetListener() {

				@Override
				public void onDateSet(DatePicker view, int year,
						int monthOfYear, int dayOfMonth) {
					// 处理整个业务逻辑
				}
			};
			DatePickerDialog dialog = new DatePickerDialog(this, listener,
					Calendar.YEAR+1990, Calendar.MONTH, Calendar.DATE);
			dialog.setIcon(R.drawable.ic_launcher);
			dialog.setTitle("请选择日期：");
			// /对话框显示
			dialog.show();
			break;
		default:
			break;
		}
	}
}
