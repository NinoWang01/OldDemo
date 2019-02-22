package com.pb.android_107_19_01_test;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	public ImageView image_view;
	public int[] picture = { R.drawable.bg01, R.drawable.bg02, R.drawable.bg03,
			R.drawable.bg04, R.drawable.bg05, };
	public int index = 0;
	// 消息处理
	public Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
				// 给当前的iamgeView 设置一张图片
				image_view.setImageResource(picture[(index++) % 5]);
				// 多做一个判断
				break;
			default:
				break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		image_view = (ImageView) findViewById(R.id.imageview_main_id);
		// 开启一个子线程，利用子线程休眠的方式，让图片进行切换
		// new Thread(new Runnable() {
		// @Override
		// public void run() {
		// // 让线程休眠2秒钟
		// while (true) {
		// try {
		// Thread.sleep(2000);
		// // 告诉主线程，发消息
		// handler.sendEmptyMessage(0);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		// }
		// }).start();

		// 利用定时器（时间类）来操作
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				// 告诉主线程，发消息
				handler.sendEmptyMessage(0);
			}
		}, 0, 2000);

	}
}
