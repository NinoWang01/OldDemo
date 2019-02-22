package com.pb.android_107_10_test.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pb.android_107_10_test.R;
import com.pb.android_107_10_test.bean.Book;

public class MyAdapter extends BaseAdapter {
	// 本地化一个集合
	public List<Book> list = null;
	// 布局加载器
	public LayoutInflater inflater;

	// 构造方法
	public MyAdapter(Context context, List<Book> list) {
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

		// 创建ViewHolder
		ViewHolder holder = null;
		if (convertView == null) {
			// 实例化holder
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item_fenpage, null);
			// 实例化四个TextView
			holder.text_view_1 = (TextView) convertView
					.findViewById(R.id.text_view_id_1);
			holder.text_view_2 = (TextView) convertView
					.findViewById(R.id.text_view_id_2);
			holder.text_view_3 = (TextView) convertView
					.findViewById(R.id.text_view_id_3);
			holder.text_view_4 = (TextView) convertView
					.findViewById(R.id.text_view_id_4);
			// 对holder做标记
			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		// 先得到一个个实体类对象
		// Book b=new Book();//整个实体类都空的，
		final Book b = list.get(position);

		holder.text_view_1.setText(b.getName());
		holder.text_view_2.setText(b.getAuthor());
		holder.text_view_3.setText(String.valueOf(b.getPage()));
		holder.text_view_4.setText(String.valueOf(b.getPrice()));

		return convertView;
	}

	class ViewHolder {
		TextView text_view_1;
		TextView text_view_2;
		TextView text_view_3;
		TextView text_view_4;

	}

}
