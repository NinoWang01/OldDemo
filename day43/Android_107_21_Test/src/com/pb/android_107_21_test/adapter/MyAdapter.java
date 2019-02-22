package com.pb.android_107_21_test.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pb.android_107_21_test.R;
import com.pb.android_107_21_test.bean.ItemEntity;

public class MyAdapter extends BaseAdapter {
	public List<ItemEntity> list = null;
	public Context context;
	public LayoutInflater inflater;

	// 构造方法
	public MyAdapter(List<ItemEntity> list,  Context context) {
		if (list != null) {
			this.list = list;
		} else {
			list = new ArrayList<ItemEntity>();
		}
		this.context = context;
		inflater = LayoutInflater.from(context);

	}

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
		//
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_page, null);
			holder.text_view_1 = (TextView) convertView
					.findViewById(R.id.text_view_id_1);
			holder.text_view_2 = (TextView) convertView
					.findViewById(R.id.text_view_id_2);
			holder.text_view_3 = (TextView) convertView
					.findViewById(R.id.text_view_id_3);
			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		// 给是三个控件赋值
		holder.text_view_1.setText(String.valueOf(list.get(position)
				.getPublished_at()));
		holder.text_view_2.setText(list.get(position).getContent());
		holder.text_view_3.setText(String.valueOf(list.get(position)
				.getShare_count()));
		return convertView;
	}

	// 内部类
	class ViewHolder {
		public TextView text_view_1;
		public TextView text_view_2;
		public TextView text_view_3;
	}

}
