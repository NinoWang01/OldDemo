package com.pb.android_107_11_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.pb.android_107_11_test.bean.Person;
import com.pb.android_107_11_test.dao.PersonDao;

public class MainActivity extends Activity {

	//
	public ListView lsit_view;
	// 集合接收查询的数据
	public List<Person> list;

	// handler,主线程对象接收子线程发送的消息
	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 10:
				// 接收导数据之后，更新UI界面
				lsit_view.setAdapter(new MyAdapter());
				break;
			default:
				break;
			}

		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lsit_view = (ListView) findViewById(R.id.list_view_id);
		// 子线程
		new Thread() {
			@Override
			public void run() {
				// 添加数据的方法
				addData();
				// 获取person集合(转化成本地list)
				getPerson();
				// 如果说查到了数据，把数据发送给主线程
				if (list.size() > 0) {
					handler.sendEmptyMessage(10);
				}

			}

		}.start();

	}

	public void addData() {
		// 创建数据库
		PersonDao pd = new PersonDao(this);
		long number = 123456001;
		for (int i = 0; i < 10; i++) {
			pd.add("张三" + i, Long.toString(number + i));
		}
	}

	// 获取ContentProvider暴露的数据，进行查询
	public void getPerson() {
		// 获得一个URI
		String ur = "content://com.pb.android_107_11_test.provider/query";
		Uri uri = Uri.parse(ur);
		// 创建ContentResolver的实例
		ContentResolver resolver = getContentResolver();
		// 使用ContentResolver的实例查询数据
		Cursor cursor = resolver.query(uri, null, null, null, null);

		// 实例化集合对象
		list = new ArrayList<Person>();
		// 循环cursor
		while (cursor.moveToNext()) {
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String name = cursor.getString(cursor.getColumnIndex("name"));
			String number = cursor.getString(cursor.getColumnIndex("number"));
			// 把这是哪个值都装进person对象中
			Person p = new Person(id, name, number);
			// 在p装到集合中去
			list.add(p);
		}
		cursor.close();

	}

	// 适配器
	public class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return list.size();
		}

		public Object getItem(int position) {
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// 得到试题对象
			Person ps = list.get(position);
			View view = View.inflate(MainActivity.this, R.layout.item_phnoe,
					null);
			// 创建两个控件
			TextView text_view_1 = (TextView) view
					.findViewById(R.id.text_view_id_1);
			text_view_1.setText("姓名：" + ps.getName());
			
			TextView text_view_2 = (TextView) view
					.findViewById(R.id.text_view_id_2);
			text_view_2.setText("电话:" + ps.getNumber());
			
			return view;
		}

	}

}
