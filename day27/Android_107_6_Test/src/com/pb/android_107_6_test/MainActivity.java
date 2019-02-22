package com.pb.android_107_6_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	// 创建listview
	public ListView list_view;
	// 创建一个数据源
	public List<String> list = null;
	// 适配器
	public ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		list_view = (ListView) findViewById(R.id.list_view_id);
		// 创建数据源对象
		list = new ArrayList<String>();
		// 给数据源添加数据
		for (int i = 0; i < 50; i++) {
			list.add("数据源中第" + i + "条数据");
		}
		// 创建适配器
		adapter = new ArrayAdapter<String>(this, R.layout.adapter_page, list);
		// 把adapter和listview进行绑定
		list_view.setAdapter(adapter);

	}

}
