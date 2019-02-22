package com.pb.android_107_3_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Toast;

public class PlayTouchActivity_Test extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 去掉标题栏,这行代码的位置一定要在setContentView(R.layout.touch_test);之前
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.touch_test);
	}

	// 对应按键按下的事件的监听
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		Toast.makeText(PlayTouchActivity_Test.this, "按键按下！！！",
				Toast.LENGTH_SHORT).show();
		return super.onKeyDown(keyCode, event);
	}

	// 对应按键松开的事件
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub

		Toast.makeText(PlayTouchActivity_Test.this, "按键弹起！！！",
				Toast.LENGTH_SHORT).show();
		return super.onKeyUp(keyCode, event);
	}

	// 对应点击屏幕事件
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// 用户到底点的是哪个位置
		float x = event.getX();// 用户点击X的坐标
		float y = event.getY();// 用户点击Y的坐标

		Toast.makeText(PlayTouchActivity_Test.this,
				"用户点击了" + x + ":" + y + "这个坐标", Toast.LENGTH_SHORT).show();
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}

}
