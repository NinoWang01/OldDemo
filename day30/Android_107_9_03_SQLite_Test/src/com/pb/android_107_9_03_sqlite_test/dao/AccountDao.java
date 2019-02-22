package com.pb.android_107_9_03_sqlite_test.dao;

import java.util.ArrayList;
import java.util.List;

import com.pb.android_107_9_03_sqlite_test.bean.Account;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

//对应数据库的工具类,包含增删改查方法
public class AccountDao {

	// 声明数据库的一个对象
	private MyHelper helper;

	public AccountDao(Context context) {
		// 创建AccountDao的时候创建数据库
		helper = new MyHelper(context);
	}
	// 插入数据的方法
	public void insert(Account account) {
		// 用来装载插入的数据的类似于map< key，value >这么一个东西
		SQLiteDatabase db = helper.getWritableDatabase();
		// 得到封装数据的类的实例
		ContentValues values = new ContentValues();
		values.put("name", account.getName());
		values.put("balance", account.getBalance());

		// 得到商品的ID
		long id = db.insert("account", null, values);
		account.setId(id);
		// 关闭数据库
		db.close();
	}

	// 删除数据的方法
	public int delete(long id) {
		// 获得操作数据库的实例
		SQLiteDatabase db = helper.getWritableDatabase();
		// 按条件删除指定表中数据，返回受影响的行数
		int count = db.delete("account", "_id=?", new String[] { id + " " });
		// 关闭数据库
		db.close();
		return count;
	}

	// 更新数据,接收一个参数，接收的是实体类对象
	public int update(Account account) {
		SQLiteDatabase db = helper.getWritableDatabase();
		// 得到封装数据的类的实例
		ContentValues values = new ContentValues();
		values.put("name", account.getName());
		values.put("balance", account.getBalance());
		int a = db.update("account", values, "_id=?",
				new String[] { account.getId() + "" });
		return a;
	}

	// 查询方法
	public List<Account> queryAll() {
		SQLiteDatabase db = helper.getWritableDatabase();
		// 查询数据库表
		Cursor cursor = db.query("account", null, null, null, null, null,
				"balance DESC ");
		// 创建一个list集合对象
		List<Account> list = new ArrayList<Account>();
		// 循环遍历
		while (cursor.moveToNext()) {
			//cursor
			long id = cursor.getLong(cursor.getColumnIndex("_id"));
			String name = cursor.getString(1);
			int balance = cursor.getInt(2);
			list.add(new Account(id, name, balance));
		}
		// 关闭数据库和cursor
		cursor.close();
		db.close();
		return list;

	}

}
