package com.pb.android_107_12_01_test;

import java.util.ArrayList;
import java.util.List;

import android.net.Uri;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// 声明按钮的方法
	public void onButtonClick(View v) {

		// 先拿到一个URI
		Uri uri = Uri.parse("content://sms/");
		// 获得的ContentResolver的实例
		ContentResolver resolver = getContentResolver();
		// uri, new String[]{"address","data"}, new String[]{"",""} , null
		Cursor cursor = resolver.query(uri, new String[] { "address", "date",
				"type", "body" }, null, null, null);
		// 集合list
		List<SmsInfo> list = new ArrayList<SmsInfo>();
		// 遍历cursor
		while (cursor.moveToNext()) {
			String address = cursor.getString(0);
			long date = cursor.getLong(1);
			int type = cursor.getInt(2);
			String body = cursor.getString(3);
			// 把他们四个值，打包成一个对象，放到集合当中去
			SmsInfo si = new SmsInfo(date, type, body, address);
			// 把这一个对象放到集合中去
			list.add(si);

		}
		// 管cursor
		cursor.close();
		// 去备份
		SmsUtils.CopySms(this, list);

	}
}
