package com.pb.android_107_13_02_test;

import java.io.File;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void sendNotification(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 现获得通知的管理对象
			NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			// 携带通知标题和内容的Notification实例对象
			@SuppressWarnings("deprecation")
			Notification notifition = new Notification(R.drawable.ic_launcher,
					"这是一个通知", System.currentTimeMillis());
			// notifition
			// .setLatestEventInfo(this, "G20峰会", "主题歌曲有杭州8岁小女孩演唱", null);
			// // 通知的显示
			// manager.notify(1, notifition);

			// 带有震动的通知
			Uri fileUri = Uri.fromFile(new File(
					"./system/media/audio/ringtones/Basic_tone.ogg"));
			notifition.sound = fileUri;
			// 时间间隔的设置
			long[] time = { 0, 1000, 1000, 1000 };
			notifition.vibrate = time;
			notifition.ledARGB = Color.RED;
			notifition.ledOnMS = 1000;
			notifition.ledOffMS = 1000;
			// 给通知标识
			notifition.flags = Notification.FLAG_SHOW_LIGHTS;
			
			Intent intent = new Intent(this, NewActivity.class);
			PendingIntent pi = PendingIntent.getActivity(this, 0, intent,
					PendingIntent.FLAG_CANCEL_CURRENT);
			
			notifition
					.setLatestEventInfo(this, "G20峰会", "主题歌曲有杭州8岁小女孩演唱", pi);
			// 通知的显示
			manager.notify(1, notifition);

			break;

		default:
			break;
		}
	}

}
