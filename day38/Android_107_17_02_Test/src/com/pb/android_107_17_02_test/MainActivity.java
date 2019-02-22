package com.pb.android_107_17_02_test;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends Activity implements OnClickListener {

	// 创建popuwindow
	public PopupWindow popuwindow;
	public Button button1;
	public View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.show_window_id);
		button1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.show_window_id:
			// 处理popuwindow出现位置，以及其他的监听
			popuwindowShow();
			break;

		default:
			break;
		}

	}

	// popuwindow方法实现
	@SuppressWarnings({ "static-access", "deprecation" })
	public void popuwindowShow() {
		// 获得一个布局加载器
		LayoutInflater inflater = getLayoutInflater().from(this);

		view = inflater.inflate(R.layout.popuwindow_page, null);
		// 设置popuwindow的宽和高
		popuwindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		// popuwindow获得焦点
		popuwindow.setFocusable(true);
		// 设置点击空白处消失
		popuwindow.setBackgroundDrawable(new BitmapDrawable());
		// popuwindow出现的位置的设置
		popuwindow.showAtLocation(view, Gravity.CENTER, 0, 0);

	}
}
