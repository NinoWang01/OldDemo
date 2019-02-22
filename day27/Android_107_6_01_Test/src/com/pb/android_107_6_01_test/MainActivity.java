package com.pb.android_107_6_01_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	// imageview
	public ImageView image_view;
	public CheckBox check_box;
	public TextView text_view;

	// 数据源
	public ArrayList<Map<String, Object>> list = null;
	// 适配器
	public SimpleAdapter adapter;
	public ListView list_view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aaa);
		list_view = (ListView) findViewById(R.id.aaa_id);

		// 实例化
		list = new ArrayList<Map<String, Object>>();
		// 创建一个map集合
		Map<String, Object> map;
		// 给map集合放值
		for (int i = 1; i < 50; i++) {
			// 集合对象
			map = new HashMap<String, Object>();
			// 往集合中添加数据
			map.put("img", R.drawable.ic_launcher);
			map.put("text", "数据的第" + i + "项数据");
			map.put("checkbox", "");
			// 把map集合放到list集合当中去
			list.add(map);
		}
		// 实例化adapter
		adapter = new SimpleAdapter(this, list, R.layout.activity_main,
				new String[] { "img", "text", "checkbox" }, new int[] {
						R.id.image_view_id, R.id.text_view_id,
						R.id.check_box_id });
		// 把adapter放到listview（当前的activity）
		list_view.setAdapter(adapter);

		list_view.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 显示点击了那一条
				Toast.makeText(getApplicationContext(),
						"第" + position + "项，被点击了", Toast.LENGTH_LONG).show();
				// 点击删除某一项
				list.remove(position);
				// 刷新当前页面
				adapter.notifyDataSetChanged();

			}
		});

	}

	// // 当前的item的条目点击事件的监听
	// @Override
	// protected void onListItemClick(ListView l, View v, int position, long id)
	// {
	// // 显示点击了那一条
	// Toast.makeText(getApplicationContext(), "第" + position + "项，被点击了",
	// Toast.LENGTH_LONG).show();
	// // 点击删除某一项
	// list.remove(position);
	// // 刷新当前页面
	// adapter.notifyDataSetChanged();
	// }

}
