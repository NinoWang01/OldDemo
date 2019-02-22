package com.pb.android_107_11_test.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PersonHelper extends SQLiteOpenHelper {
	public static final String CREATE_TABLE = "create table person(" +
			"id integer primary key autoincrement,"
			+ "name VARCHAR(20)," + "number VARCHAR(20))";

	public PersonHelper(Context context) {
		super(context, "personStore.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 创建表
		db.execSQL(CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
