package com.pb.android_107_11_test.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

//数据库的操作类
public class PersonDao {

	// 声明数据库的操作对象
	public PersonHelper helper;

	// 创建一个构造方法
	public PersonDao(Context context) {

		helper = new PersonHelper(context);

	}

	// 添加的方法
	public long add(String name, String number) {
		// 获得操作数据库的实例
		SQLiteDatabase db = helper.getWritableDatabase();
		// 封装数据
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("number", number);
		// 数据插入到表中去
		long conut = db.insert("person", null, values);
		db.close();
		return conut;

	}

}
