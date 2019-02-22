package com.pb.android_107_15_test;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.pb.android_107_15_test.adapter.MyAdapter;

public class MainActivity extends Activity {

	// 声明ViewPage
	public ViewPager viewPager;
	// 集合
	public List<View> list;
	// 适配器
	public MyAdapter adapter;
	// 图片数组
	int[] pageArray = { R.drawable.page_1, R.drawable.page_2,
			R.drawable.page_3, R.drawable.page_4, R.drawable.page_5,
			R.drawable.page_6 };
	// 创建
	public LinearLayout layout;
	// 小点的数组对象
	public ImageView[] dot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		list = new ArrayList<View>();
		// 给集合赋值
		for (int i = 0; i < pageArray.length; i++) {
			// 实例化ImageView
			ImageView imageView = new ImageView(this);
			// 把图片数组放到ImageView中去
			imageView.setImageResource(pageArray[i]);
			// 再把imageView放到list中去
			list.add(imageView);
		}
		// 实例化adapter
		adapter = new MyAdapter(this, list);
		// 实例化ViewPager
		viewPager = (ViewPager) findViewById(R.id.view_page_id);
		// 把adapter放到ViewPager中去
		viewPager.setAdapter(adapter);
		// 监听用户的滑动行为
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// 滑动之前应该都是灰色
				for (int i = 0; i < dot.length; i++) {
					dot[i].setEnabled(true);
				}
				// 被滑动的小点改变成白色
				dot[position].setEnabled(false);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});
		// 用户没有滑动图片，而是点击了小点
		initDot();

	}

	// 用户没有滑动图片，而是点击了小点方法的具体实现
	public void initDot() {
		// 首先实例化
		layout = (LinearLayout) findViewById(R.id.layout_id);
		// 创建dot的对象
		dot = new ImageView[pageArray.length];
		// 点击的时候小点变化，图片也要跟着变化
		for (int i = 0; i < dot.length; i++) {
			// 得到layout中的子控件
			dot[i] = (ImageView) layout.getChildAt(i);
			// 设置当前小点的颜色
			dot[i].setEnabled(true);
			// 做标记
			dot[i].setTag(i);
			// 点击事件
			dot[i].setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// 把相应的图片设置到ViewPager当中去
					viewPager.setCurrentItem((Integer) v.getTag());

				}
			});

		}

		// 当我第一次进来的时候，初始化一个选中的小点
		dot[0].setEnabled(false);

	}

}
