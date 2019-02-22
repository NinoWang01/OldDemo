package com.pb.android_107_6_02_test.adapter;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import com.pb.android_107_6_03_test.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	// 本地化（MyAdapter）的集合
	public List<String> list = null;
	// 布局加载器
	public LayoutInflater inflater;

	// 为了创建适配器对象，添加自定适配器的构造方法
	public MyAdapter(Context context, List<String> list) {
		this.list = list;
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
		/*
		 * 判断convertView在第二次显示新的item（即第一次线上滑动的时候，
		 * 是否为空，为空则创建新的对象，不为空则不创建新的convertView对象）
		 */
		// 声明一个内部类对象
		ViewHolder holder = null;
		if (convertView == null) {
			// 实例化内部类对象
			holder = new ViewHolder();
			// 创建convertView(视图)的对象
			convertView = inflater.inflate(R.layout.item_page, null);
			Log.d("创建convertView的次数", "convertView-------------------");
			holder.text = (TextView) convertView
					.findViewById(R.id.text_view_id);
			Log.d("创建text的次数", "findViewById-------------------");
			holder.button = (Button) convertView.findViewById(R.id.button_id);
			Log.d("创建button的次数", "findViewById-------------------");
			// 标记XML中的控件
			convertView.setTag(holder);
		} else {
			// 通过标记查找到被标记的控件
			holder = (ViewHolder) convertView.getTag();
		}
		holder.text.setText(list.get(position));
		holder.button.setText(list.get(position));
		return convertView;
	}

	// 创建一个内部类
	static class ViewHolder {
		TextView text;
		Button button;
	}
}
