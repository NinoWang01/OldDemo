package com.pb.android_107_12_test;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	//
	public ListView list_view;

	public ArrayAdapter<String> adapter;

	public List<String> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list_view = (ListView) findViewById(R.id.list_view_id);
		list = new ArrayList<String>();
		// adapter
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		list_view.setAdapter(adapter);
		// 读取手机联系人信息
		readPhone();

	}

	// 读取手机联系人信息
	private void readPhone() {

		// 现获得ContentResolver的实例
		ContentResolver resolver = getContentResolver();
		// 创建一个Cursor
		Cursor cursor = null;

		cursor = resolver.query(
				ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null,
				null, null);
		// 判断和循环
		while (cursor != null && cursor.moveToNext()) {

			// 获取手机联系人
			String name = cursor.getString(cursor
					.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
			// 获取手机号
			String number = cursor
					.getString(cursor
							.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

			list.add(name + "  " + number);

		}

		// 关闭cursor
		cursor.close();

	}
}
