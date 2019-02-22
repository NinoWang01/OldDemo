package com.pb.play_00_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import adapter.MyAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

/*
 * List<Map<String, Object>> listData = new ArrayList<Map<String, Object>>();

 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 Intent intent = getIntent();
 Bundle bundle = intent.getExtras();
 List<Map<String, Object>> listData= (List) bundle.getSerializable(”data“);
 */

public class SecondActivity extends Activity {

	public ListView list_view;
	public MyAdapter adapter;
	public List<Map<String, Object>> list_2 = null;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_page);

		// 实例化list_view
		list_view = (ListView) findViewById(R.id.list_view_id);
		// 获得intent的实例
		Intent intent = getIntent();
		// 获得bundle的实例
		Bundle bundle = intent.getExtras();
		// 获取实例传过来的list集合
		list_2 = (List) bundle.getSerializable("data");

		// 获取适配器对象
		adapter = new MyAdapter(this, list_2);
		list_view.setAdapter(adapter);

	}

}
