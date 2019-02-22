package com.pb.android_107_7_04_test.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLite extends SQLiteOpenHelper {

	// 创建表的一个SQL语句
	public static final String CREATE_BOOK = "create table Book("
			+ "id integer primary key autoincrement," + "author text,"
			+ "price real," + "pages integer," + "name text)";
//	public Context context;
//	public MySQLite(Context context) {
//		super(context, "store.db", null, 1);
//		this.context = context;
//	}

	public MySQLite(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 创建数据库中表
		db.execSQL(CREATE_BOOK);
		// 给数据库的表的字段添加值,其本质是在封装数据
		ContentValues values = new ContentValues();
		// 数据源
		for (int i = 0; i < 50; i++) {
			values.put("author", "jack" + i);
			values.put("price", 56.5 + i);
			values.put("pages", 300 + i);
			values.put("name", "life" + i);
			// 把封装的数据添加到数据库中
			db.insert("Book", null, values);

		}

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
