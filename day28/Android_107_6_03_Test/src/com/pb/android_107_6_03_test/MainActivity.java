package com.pb.android_107_6_03_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.pb.android_107_6_02_test.adapter.MyAdapter;

public class MainActivity extends Activity {

	public ListView list_view;
	public MyAdapter adapter;

	public List<String> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list_view = (ListView) findViewById(R.id.lsit_view_id);
		list = new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {
			list.add("这是第" + i + "条数据");
		}
		adapter = new MyAdapter(this, list);
		list_view.setAdapter(adapter);

	}

}
