package com.pb.android_107_21_test;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pb.android_107_21_test.adapter.MyAdapter;
import com.pb.android_107_21_test.bean.ItemEntity;
import com.pb.android_107_21_test.tools.MyAsyncTask;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.AbsListView.OnScrollListener;

public class MainActivity extends Activity {
	public ListView list_view;
	public List<ItemEntity> totallist = null;
 
	public MyAdapter adapter = null;
	// json请求地址
	public String stringUrl = "http://m2.qiushibaike.com/article/list/suggest?page=1";
	public ByteArrayOutputStream baos;
	public BufferedInputStream bis;

	// 声明一个变量，作为滑动事件时页面请求参数page值的改变
	public int page_change = 1;
	// 滑动事件一个布尔类型变量
	public boolean isHuaDong = false;
	// 进度条
	public LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件'
		list_view = (ListView) findViewById(R.id.list_view_id);
		layout = (LinearLayout) findViewById(R.id.linear_layout_id);

		inintMyAsyncTast();

		// 创建集合实例
		totallist = new ArrayList<ItemEntity>();
		// 创建适配器
		adapter = new MyAdapter(totallist, this);
		list_view.setAdapter(adapter);
		// listview监听
		list_view.setOnScrollListener(new OnScrollListener() {
			// 当前页面状态的改变
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				if (isHuaDong) {
					// 页面变量++
					page_change++;
					layout.setVisibility(View.VISIBLE);
					// 做一次网络请求
					// new MyAsyncTask(MainActivity.this).execute(stringUrl
					// + page_change);
				} else {
					layout.setVisibility(View.GONE);
				}
			}

			// 滑动监听，第二页的第一条数据要从那一条开始显示
			@Override
			public void onScroll(AbsListView view, int firstVisibleItem,
					int visibleItemCount, int totalItemCount) {
				isHuaDong = ((firstVisibleItem + visibleItemCount) == totalItemCount);
			}
		});
	}

	private void inintMyAsyncTast() {
		// 创建异步的实例,得到了解析的数据//只传了一个URL
		new MyAsyncTask(MainActivity.this, handler).execute(stringUrl
				+ page_change);
	}

	public void layoutOnClick(View v) {
		switch (v.getId()) {
		case R.id.linear_layout_id:
			// 页面变量++
			page_change++;
			// 做一次网络请求
			layout.setVisibility(View.GONE);
			new MyAsyncTask(MainActivity.this, handler).execute(stringUrl
					+ page_change);
			break;
		default:
			break;
		}
	}

	// 接收消息
	Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {

			totallist.addAll((List<ItemEntity>) msg.obj);
			// 刷新页面
			adapter.notifyDataSetChanged();

		}

	};

}
