package com.pb.android_107_11_test.provider;

import com.pb.android_107_11_test.dao.PersonHelper;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class MyContentProvider extends ContentProvider {
	// 创建一个匹配URI的匹配器，匹配URI，若果成功返回数据，失败返回-1
	public static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
	public static final int INSERT = 1;// 添加数据匹配URI成功的一个返回码
	public static final int DELETE = 2;// 删除数据匹配URI成功的一个返回码
	public static final int QUERY = 3;// 查询数据匹配URI成功的一个返回码
	public static final int UPDATE = 4;// 更新数据匹配URI成功的一个返回码
	public static final int QUERY_ONE = 5;// 查询一条数据匹配URI成功的一个返回码

	public PersonHelper helper;

	// 静态代码块,先匹配URI，成功接着执行，失败返回-1
	static {
		//
		matcher.addURI("com.pb.android_107_11_test.provider",
				"insert", INSERT);
		matcher.addURI("com.pb.android_107_11_test.provider",
				"delete", DELETE);
		matcher.addURI("com.pb.android_107_11_test.provider",
				"query", QUERY);
		matcher.addURI("com.pb.android_107_11_test.provider",
				"update", UPDATE);
		// 返回的 查询一条数据匹配URI成功的一个返回码
		matcher.addURI("com.pb.android_107_11_test.provider",
				"query/#", QUERY_ONE);

	}

	@Override
	public boolean onCreate() {
		// 当有人第一次访问数据时候创建ContentProvider
		helper = new PersonHelper(getContext());
		return false;
	}

	// 当ContentProvider被创建的时候，调用适合的数据进行初始化
	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {

		// 匹配的路径做判断
		if (matcher.match(uri) == QUERY) {
			// 查询的本质，操作的是数据库
			SQLiteDatabase db = helper.getReadableDatabase();
			// 真是的查询方法,默认的排序方式，升序
			Cursor cursor = db.query("person", projection, selection,
					selectionArgs, null, null, sortOrder);

			return cursor;
		} else if (matcher.match(uri) == QUERY_ONE) {
			// 根据id值去查询
			long id = ContentUris.parseId(uri);
			// 查询的本质，操作的是数据库
			SQLiteDatabase db = helper.getReadableDatabase();
			// 真是的查询方法,默认的排序方式，升序
			Cursor cursor2 = db.query("person", projection, "id=?",
					new String[] { id + "" }, null, null, sortOrder);

			return cursor2;
		} else {
			throw new IllegalArgumentException("路径不匹配，不能执行查询操作");
		}

	}

	// 获取当前的URI数据类，并作为一个新的MIME返回
	@Override
	public String getType(Uri uri) {
		//
		if (matcher.match(uri) == QUERY) {
			// 查询的是结果集
			return "vnd.android.cursor.dir/person";

		} else if (matcher.match(uri) == QUERY_ONE) {
			return "vnd.android.cursor.item/person";
		} else {
			throw new IllegalArgumentException("路径不匹配，不能执行查询操作");
		}

	}

	// 添加数据的方法
	@Override
	public Uri insert(Uri uri, ContentValues values) {

		if (matcher.match(uri) == INSERT) {
			SQLiteDatabase db = helper.getWritableDatabase();
			db.insert("person", null, values);
		} else {
			throw new IllegalArgumentException("路径不匹配，不能执行查询操作");
		}
		return null;

	}

	// 删除数据
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {

		if (matcher.match(uri) == DELETE) {
			SQLiteDatabase db = helper.getWritableDatabase();
			db.delete("person", selection, selectionArgs);
		} else {
			throw new IllegalArgumentException("路径不匹配，不能执行查询操作");
		}
		return 0;
	}

	// 更新数据
	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		if (matcher.match(uri) == UPDATE) {

			SQLiteDatabase db = helper.getWritableDatabase();
			db.update("person", values, selection, selectionArgs);

		} else {
			throw new IllegalArgumentException("路径不匹配，不能执行查询操作");
		}

		return 0;
	}

}
