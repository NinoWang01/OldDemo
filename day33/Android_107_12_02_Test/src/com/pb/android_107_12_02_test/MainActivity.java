package com.pb.android_107_12_02_test;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {
	public TextView text_view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text_view = (TextView) findViewById(R.id.text_view_id);
		// ContentResolver
		ContentResolver res = getContentResolver();
		// 短信的URI
		Uri uri = Uri.parse("content://sms/");
		// 调用内容观察者
		res.registerContentObserver(uri, true, new MyContentObserver(
				new Handler()));
	}
	// 自定义内容观察者ContentObserver
	public class MyContentObserver extends ContentObserver {
		public MyContentObserver(Handler handler) {
			super(handler);
		}
		public void onChange(boolean selfChange) {
			super.onChange(selfChange);
			// 吐丝数据变化
//			Toast.makeText(MainActivity.this, "数据发生变化了。。。。。。",
//					Toast.LENGTH_LONG).show();
			// 短信的URI
			Uri uri = Uri.parse("content://sms/");
			ContentResolver re = getContentResolver();
			// 对短信中的数据座椅查询
			Cursor cursor = re.query(uri, new String[] { "address", "date",
					"type", "body" }, null, null, null);
			// 如果没有设置查询出的数据的排列方式，那么就会倒序排列
			cursor.moveToFirst();// 拿到的是cursor中的第一个数据
			String address = cursor.getString(0);
			String body = cursor.getString(3);
			text_view.setText("短信地址：" + address + "\n" + "短信内容" + body);
			cursor.close();
		}

	}

}
