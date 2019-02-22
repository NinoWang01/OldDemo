package com.pb.android_107_20_01_test.adapter;

import java.util.List;
import java.util.Map;

import com.pb.android_107_20_01_test.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	// 本地化list
	public List<Map<String, String>> list = null;
	public LayoutInflater inflater;

	// 构造方法
	public MyAdapter(List<Map<String, String>> list, Context context) {
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

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
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_page, null);
			holder.text_view_1 = (TextView) convertView
					.findViewById(R.id.text_view_1);
			holder.text_view_2 = (TextView) convertView
					.findViewById(R.id.text_view_2);
			holder.text_view_3 = (TextView) convertView
					.findViewById(R.id.text_view_3);
			holder.text_view_4 = (TextView) convertView
					.findViewById(R.id.text_view_4);
			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();

		}
		holder.text_view_1.setText(String.valueOf(list.get(position).get(
				"created_at")));
		holder.text_view_2.setText(list.get(position).get("content"));
		holder.text_view_3.setText(String.valueOf(list.get(position).get(
				"comments_count")));
		holder.text_view_4.setText(list.get(position).get("login")+"\t"+position);

		return convertView;
	}

	// 创建一个内部类
	class ViewHolder {
		public TextView text_view_1;
		public TextView text_view_2;
		public TextView text_view_3;
		public TextView text_view_4;
		

	}

}
