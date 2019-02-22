package com.pb.android_107_26_02_test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MyFragment extends FragmentActivity {

	// 总的fragment对应页面的页数
	public static final int NUMBER = 20;
	// listview 和adapter
	public ListView list_view;
	public MyAdapter myadapter;

	// ViewPager
	public ViewPager vpager;
	// 碎片管理器对象
	public FragmentManager manager;
	// 系统适配器
	public static ArrayAdapter<String> adapter;

	// 存放页面上的显示的数据的数组
	public static String[] adapterData = new String[] { "中国", "韩国", "俄罗斯",
			"印度", "新加坡", "日本", "美国", "德国", "英国", "法国", "印度尼西亚", "马尔代夫", "加拿大",
			"拉斯维加斯", "非洲", "南美洲", "澳大利亚", "巴基斯坦", "老挝", "缅甸", "越南", "菲律宾",
			"阿富汗", "伊拉克", "伊朗", "瑞典", "朝鲜", "太阳" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 引用viewpager相应的布局
		setContentView(R.layout.view_page);
		//
		manager = getSupportFragmentManager();
		// 实例化适配器
		myadapter = new MyAdapter(manager);
		// 实例化
		vpager = (ViewPager) findViewById(R.id.view_pager_id);
		// 把适配器加入vpager中
		vpager.setAdapter(myadapter);

	}

	public static class MyAdapter extends FragmentStatePagerAdapter {

		public MyAdapter(FragmentManager fm) {
			super(fm);
		}
		// 是要加入到viewpager中的fragment对应页面的页数
		@Override
		public int getCount() {
			return NUMBER;
		}
		// 每次加入viewpager中的碎片
		@Override
		public Fragment getItem(int position) {
			return myListFragment.NewInstance(position);
		}
	}

	// 创建一个静态内部碎片，让它继承ListFragment
	public static class myListFragment extends ListFragment {
		int mynumber;

		static myListFragment NewInstance(int number) {
			myListFragment myfr = new myListFragment();
			// 创建一个Bundle
			Bundle bundle = new Bundle();
			bundle.putInt("mynumber", number);
			// 把值给它传过去
			myfr.setArguments(bundle);
			return myfr;
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			mynumber = getArguments() != null ? getArguments().getInt(
					"mynumber") : 1;

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View view = inflater
					.inflate(R.layout.my_fragment, container, false);
			TextView text_view = (TextView) view
					.findViewById(R.id.text_view_id);
			text_view.setText("fragment_" + mynumber);
			return view;
		}

		@Override
		public void onViewCreated(View view, Bundle savedInstanceState) {
			super.onViewCreated(view, savedInstanceState);

			adapter = new ArrayAdapter<String>(getActivity(),
					android.R.layout.simple_list_item_1, adapterData);
			setListAdapter(adapter);

		}

	}

}
