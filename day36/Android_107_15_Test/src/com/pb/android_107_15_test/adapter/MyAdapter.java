package com.pb.android_107_15_test.adapter;

import java.util.List;

import com.pb.android_107_15_test.NewActivity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MyAdapter extends PagerAdapter {
	public List<View> list;
	public Context context;

	// 构造起方法
	public MyAdapter(Context context, List<View> list) {
		this.context = context;
		this.list = list;
	}

	// 返回当前数据的长度
	@Override
	public int getCount() {
		return list.size();
	}

	/*
	 * container：存储图片的容器 position：当前item的位置
	 * 
	 * 点击放在这里来做
	 */
	@Override
	public Object instantiateItem(ViewGroup view, int position) {

		view.addView(list.get(position));

		list.get(position).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, NewActivity.class);
				context.startActivity(intent);
			}
		});

		return list.get(position);
	}

	// 销毁当前item
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(list.get(position));
	}

	// 当要显示的图片，判断它是否为上一张图，
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

}
