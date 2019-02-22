package com.pb.android_107_10_test.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
	// 创建数据库的SQL语句常量
	public static final String CREATE_BOOK = "create table Book("
			+ "id integer primary key autoincrement," + "author text,"
			+ "price real," + "pages integer," + "name text)";

	public MyHelper(Context context) {
		super(context, "book.db", null, 1);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 创建表
		db.execSQL(CREATE_BOOK);
		// 创建表的时候添加数据
		ContentValues values = new ContentValues();
		// 循环封装数据
		for (int i = 0; i < 100; i++) {
			values.put("author", "tom_" + i);
			values.put("name", "life_" + i);
			values.put("pages", 100 + i);
			values.put("price", 69.998 + i);
			// 整条数据添加到表中
			db.insert("Book", null, values);

		}

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
