package com.pb.android_107_26_01_test;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Fragment_Icon extends Fragment {

	// 接收设置图片的的数组
	public int[] settingicon;
	// 接收设置内容
	public String[][] settintContent;
	public View view;
	// listview
	public ListView list_view;
	// 上下文对象
	public MainActivity activity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.icon_fragment, container, false);

		// 实例化activity
		activity = (MainActivity) getActivity();
		// 调用获取图标数组的方法
		settingicon = activity.getIcon();
		// 调用获取内容数组的方法
		settintContent = activity.getContentText();
		// 判断
		if (view != null) {
			// 需要实例化的控件
			initView();
		}
		// 给listview做一个监听
		list_view.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 获得里一个碎片的对象
				Fragment_Content fragment_content = (Fragment_Content) activity
						.getFragmentManager().findFragmentById(
								R.id.settint_content_id);
				// 传一个一维数组
				fragment_content.setText(settintContent[position]);
			}
		});

		return view;
	}

	// 初始化控件
	public void initView() {
		list_view = (ListView) view.findViewById(R.id.list_view_id);
		// 判断
		if (settingicon != null) {
			// 把适配器放进去
			list_view.setAdapter(new myAdapter());

		}

	}

	// 适配器
	class myAdapter extends BaseAdapter {

		// 图标数组的长度
		@Override
		public int getCount() {
			return settingicon.length;
		}

		@Override
		public Object getItem(int position) {
			return settingicon[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			convertView = View.inflate(getActivity(), R.layout.item_icon, null);
			ImageView imageview = (ImageView) convertView
					.findViewById(R.id.image_view_id);

			// 设置图标

			imageview.setBackgroundResource(settingicon[position]);

			return convertView;
		}

	}

}
