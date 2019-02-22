package com.pb.android_107_10_test;

import java.util.List;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.pb.android_107_10_test.adapter.MyAdapter;
import com.pb.android_107_10_test.bean.Book;
import com.pb.android_107_10_test.tools.DbUtils;

public class MainActivity extends Activity {

	// 对应布局文件的控件
	public Button button_up, button_down;
	public TextView text_View;
	public ListView list_view;
	public MyAdapter adapter;
	public List<Book> list;
	public DbUtils utils;

	// 当前页数
	public int pageIndex = 1;
	// 当前页面上的数据条数
	public int pageSize = 10;
	public int count;
	public int TotalPage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		init();
		initData();
		// 实例化adapter
		adapter = new MyAdapter(this, list);
		list_view.setAdapter(adapter);
	}

	private void initData() {
		// 创建数据库
		utils = new DbUtils(this);
		// 查询数据
		list = utils.queryPage(pageIndex, pageSize);
		//
		count = utils.qureyCount();
		// 计算总的页数
		TotalPage = count % pageSize == 0 ? count / pageSize : count / pageSize
				+ 1;
		// 把当前页数和总的页数设置到TextView
		text_View.setText(String.format("%d/%d", pageIndex, TotalPage));

	}

	private void init() {
		// 实例化控件
		button_up = (Button) findViewById(R.id.button_up);
		button_down = (Button) findViewById(R.id.button_down);
		list_view = (ListView) findViewById(R.id.list_view_id);
		text_View = (TextView) findViewById(R.id.text_view_page_id);
		// 做监听
		button_up.setOnClickListener(listener);
		button_down.setOnClickListener(listener);

	}

	// 创建一个监听器
	private OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// 布尔类型的变量
			boolean change = false;
			switch (v.getId()) {
			case R.id.button_up:
				// 查询上一页的数据
				// 判断
				if (pageIndex > 1) {
					pageIndex--;
					// 通过这个变量来决定是否要查询上一页的数据
					change = true;
				}
				break;
			case R.id.button_down:
				// 查询下一页的数据
				// 判断
				if (pageIndex < TotalPage) {
					pageIndex++;
					change = true;
				}

				break;
			default:
				break;
			}
			// 根据change来判定是否调用数据库中相应数据
			if (change) {
				// 把当前集合清空
				list.clear();
				list.addAll(utils.queryPage(pageIndex, pageSize));
				// 刷新页面
				adapter.notifyDataSetChanged();
				// 把当前页数和总的页数设置到TextView
				text_View.setText(String.format("%d/%d", pageIndex, TotalPage));

			}

		}

	};

}
