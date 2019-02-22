package com.pb.android_107_9_03_sqlite_test.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {

//	public Context context;

	public MyHelper(Context context) {
		super(context, "my.db", null, 2);
//		this.context = context;

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 自增长ID作为主键
		db.execSQL("CREATE TABLE account(_id integer primary key autoincrement,"
				+ "name  VARCHAR(20),"
				+ "balance Integer)");
		
//		db.execSQL("CREATE TABLE account(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
//				+ "name VARCHAR(20)," + // 姓名列
//				"balance INTEGER)"); 
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
