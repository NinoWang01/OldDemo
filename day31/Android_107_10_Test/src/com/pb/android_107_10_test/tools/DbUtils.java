package com.pb.android_107_10_test.tools;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.pb.android_107_10_test.bean.Book;
import com.pb.android_107_10_test.dao.MyHelper;

//制作对数据库的查询工作
public class DbUtils {

	// 创建一个实例
	public MyHelper helper;

	public DbUtils(Context context) {
		helper = new MyHelper(context);
	}

	/*
	 * 分页查询数据的方法 pageIndext:你要查询的那一页的页数 5 6 pageSize：你要查询的那一页的数据的长度
	 */
	public List<Book> queryPage(int pageIndex, int pageSize) {

		// 查询数据库的SQL语句
		String sql = "select * from Book limit ?,?";

		// 获取操作数据库的实例db
		SQLiteDatabase db = helper.getWritableDatabase();
		// 去计算当前页面上显示的第一条数据是数据库中的第几条数据条件
		String startIndextstr = String.valueOf((pageIndex - 1) * pageSize);
		// 当前页面查询最后一条数据的约束条件
		String endpageSize = String.valueOf(pageSize);
		// 查询的结果cursor
		Cursor cursor = db.rawQuery(sql, new String[] { startIndextstr,
				endpageSize });
		// 创建集合对象
		List<Book> list = new ArrayList<Book>();
		// 循环cursor
		while (cursor != null && cursor.moveToNext()) {
			// 实体类对象
			Book book = new Book();

			book.setName(cursor.getString(cursor.getColumnIndex("name")));
			book.setAuthor(cursor.getString(cursor.getColumnIndex("author")));
			book.setPage(cursor.getInt(cursor.getColumnIndex("pages")));
			book.setPrice(cursor.getDouble(cursor.getColumnIndex("price")));
			list.add(book);
		}
		return list;
	}

	// 查询总页数的方法

	public int qureyCount() {
		String sql = "select count(0) from Book";
		// 获取操作数据库的实例db
		SQLiteDatabase db = helper.getWritableDatabase();
		// 整张表的长度
		Cursor cc = db.rawQuery(sql, null);
		while (cc != null && cc.moveToNext()) {

			return cc.getInt(0);//返回从第一个开始

		}

		return 0;
	}

}
