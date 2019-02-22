package com.pb.android_107_7_04_test;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.pb.android_107_7_04_test.dao.MySQLite;

public class MainActivity extends Activity implements OnClickListener {

	public Button button, button_1, button_2, button_3;
	public MySQLite my;
	public SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		button_1 = (Button) findViewById(R.id.button2);
		button_1.setOnClickListener(this);
		button_2 = (Button) findViewById(R.id.button3);
		button_2.setOnClickListener(this);
		button_3 = (Button) findViewById(R.id.button4);
		button_3.setOnClickListener(this);
		// 创建数据库
		my = new MySQLite(this, "my.db", null, 1);
		// 通过SQLiteDatabase，得到它的实例化对象之后，才能操作数据库
		db = my.getWritableDatabase();
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 添加数据
		case R.id.button1:

			ContentValues values = new ContentValues();// 类似于map集合，键值对
			values.put("price", 70.8);
			// 往表中插入数据
			db.insert("Book", null, values);//追加到当前数据库中表的最下面的一行（id值：对大）
			break;
		// 删除
		case R.id.button2:
			db.delete("Book", "pages>?", new String[] { "500" });
			break;
		// 更新
		case R.id.button3:
			ContentValues values2 = new ContentValues();// 类似于map集合，键值对
			values2.put("pages", 127.0);// 页数
			db.update("Book", values2, "pages=?", new String[] { "life7" });

			break;
		case R.id.button4:
			// 结果集交给cursor
			Cursor cursor = db
					.query("Book", null, null, null, null, null, null);
			// 遍历cursor
			// 判断
			if (cursor.moveToNext()) {

				while (cursor.moveToNext()) {
					// 作者的名字
					String author1 = cursor.getString(cursor
							.getColumnIndex("author"));
					// 书名
					String name1 = cursor.getString(cursor
							.getColumnIndex("name"));
					// 价格
					double price1 = cursor.getDouble(cursor
							.getColumnIndex("price"));
					// 页数
					int pages1 = cursor.getInt(cursor.getColumnIndex("pages"));
				}

			}
			// 关闭cursor
			cursor.close();

			break;
		default:
			break;
		}

	}
}
