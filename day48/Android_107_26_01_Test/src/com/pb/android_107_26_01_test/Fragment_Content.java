package com.pb.android_107_26_01_test;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_Content extends Fragment {

	// 声明textView 和ImageView
	public TextView text_view_title;
	public TextView text_view_content;
	//
	public ImageView image_view_title;
	public ImageView image_view_content;
	public View view;
	// 上下文对象
	public MainActivity activity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.content_fragment, container, false);

		// 判断
		if (view != null) {
			initView();
		}
		// 实例化activity
		activity = (MainActivity) getActivity();
		// 第一次进入的时候，
		setText(activity.getContentText()[0]);
		return view;
	}

	// 初始化控件的方法
	public void initView() {
		text_view_title = (TextView) view.findViewById(R.id.text_view_title_id);
		text_view_content = (TextView) view.findViewById(R.id.text_view_content_id);
	}

	// 这个方法接收一个一维数组
	public void setText(String[] str) {
		text_view_title.setText(str[0]);
		text_view_content.setText(str[1]);
	}

}
