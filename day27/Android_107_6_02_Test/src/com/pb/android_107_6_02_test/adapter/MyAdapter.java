package com.pb.android_107_6_02_test.adapter;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import com.pb.android_107_6_02_test.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	// 本地化（MyAdapter）的集合
	public List<Map<String, Object>> list = null;
	// 布局加载器
	public LayoutInflater inflater;
	// 为了创建适配器对象，添加自定适配器的构造方法
	public MyAdapter(Context context, List<Map<String, Object>> list) {
		if (list != null) {
			this.list = list;
		} else {
			list = new ArrayList<Map<String, Object>>();
		}
		// 布局加载器对象给实例化掉
		inflater = LayoutInflater.from(context);
	}
	// 返回集合的长度（数据源的长度）
	@Override
	public int getCount() {

		return list.size();
	}

	// 返回的是一个item
	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// 把创建的布局文件加载到自定义的适配器当中去
		convertView = inflater.inflate(R.layout.item_page, null);
		// 创建这三个控件
		ImageView image_view = (ImageView) convertView
				.findViewById(R.id.image_view_id);
		TextView text_view_1 = (TextView) convertView
				.findViewById(R.id.text_view_id);
		TextView text_view_2 = (TextView) convertView
				.findViewById(R.id.text_new_id);
		// 给控件放置内容
		image_view.setImageResource(Integer.parseInt(list.get(position)
				.get("icon").toString()));
		text_view_1.setText(list.get(position).get("name").toString());
		text_view_2.setText(list.get(position).get("phone").toString());
		
		return convertView;
		
	}

}
