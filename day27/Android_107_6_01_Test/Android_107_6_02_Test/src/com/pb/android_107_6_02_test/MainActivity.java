package com.pb.android_107_6_02_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pb.android_107_6_02_test.adapter.MyAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
	public ListView list_view;
	// 创建集合
	public List<Map<String, Object>> list = null;
	// 放数据的name数组
	String[] str_name = new String[] { "张三", "李四", "王族", "钱前", "李二", "赵飞",
			"张三丰", "王重阳", "杨过" };
	// 放数据的phone数组
	String[] str_phone = new String[] { "11111111111", "22222222222",
			"33333333333", "44444444444", "55555555555", "66666666666",
			"77777777777", "88888888888", "99999999999" };
	// 放数据的头像数组
	int[] str_icon = new int[] { R.drawable.book, R.drawable.check,
			R.drawable.image, R.drawable.news, R.drawable.phone_all,
			R.drawable.phone_check, R.drawable.phone_fashion,
			R.drawable.phone_used, R.drawable.shopping, };
	// 声明adapter
	public MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化listview
		list_view = (ListView) findViewById(R.id.list_main_view_id);

		// 实例化集合对象
		list = new ArrayList<Map<String, Object>>();
		// 给集合赋值
		for (int i = 0; i < str_name.length; i++) {
			// 创建map集合对象
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", str_name[i]);
			map.put("phone", str_phone[i]);
			map.put("icon", str_icon[i]);
			// 把map放入list中去
			list.add(map);
		}
		// 创建adapter的实例
		adapter = new MyAdapter(this, list);
		// 把adapter放到listview
		list_view.setAdapter(adapter);

		// ListVeiw的点击事件
		list_view.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 6) {
					Intent intent = new Intent(MainActivity.this,
							SecondActivity.class);
					startActivity(intent);
				}
			}
		});
		// 长按的事件
		list_view.setOnItemLongClickListener(new OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, "你点击了" + position + "这条数据",
						Toast.LENGTH_LONG).show();
				return true;
			}
		});

	}

}
