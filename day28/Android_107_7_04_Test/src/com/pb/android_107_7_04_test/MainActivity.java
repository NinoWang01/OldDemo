package com.pb.android_107_7_04_test;

import com.pb.android_107_7_04_test.dao.MySQLite;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 创建数据库
		MySQLite my = new MySQLite(this, "my.db", null, 1);
		SQLiteDatabase db = my.getReadableDatabase();
		ContentValues values = new ContentValues();
		values.put("price", 70.8);

		db.insert("Book", null, values);
		
		
		
		

	}

}
