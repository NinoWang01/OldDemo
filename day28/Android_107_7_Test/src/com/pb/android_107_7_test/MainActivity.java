package com.pb.android_107_7_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	// listview
	public ListView list_view;
	// 集合
	public List<String> list = null;
	// 适配器
	public ArrayAdapter<String> adapter = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list_view = (ListView) findViewById(R.id.list_view_id);
		list = new ArrayList<String>();
		list.add("张三丰");
		list.add("张无忌");
		list.add("杨过");
		list.add("小龙女");
		list.add("李莫愁");
		list.add("郭靖");
		list.add("黄蓉");
		// 创建adapter实例
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_dropdown_item, list);
		// 把adapter放入listview中
		list_view.setAdapter(adapter);
		// 给list_view做一个监听
		list_view.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 获得点击item的内容
				String data = parent.getItemAtPosition(position).toString();
				// 设置标题那个位置
				setTitle(data);

			}
		});

	}

}
