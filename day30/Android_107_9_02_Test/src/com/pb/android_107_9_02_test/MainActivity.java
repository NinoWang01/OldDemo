package com.pb.android_107_9_02_test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity implements OnClickListener {

	public Button button;
	public ProgressBar pro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		pro = (ProgressBar) findViewById(R.id.pro_gress_id);
	}
	@Override
	public void onClick(View v) {
		//
		switch (v.getId()) {
		case R.id.button1:
			// 创建一个变量
			int change = pro.getProgress();
			change += 10;
			// 设置到季度条当中
			pro.setProgress(change);

			// if (pro.getVisibility() == View.VISIBLE) {
			// pro.setVisibility(View.GONE);
			// } else {
			// pro.setVisibility(View.VISIBLE);
			// }
			break;
		default:
			break;
		}
	}
}
