package com.pb.android_107_26_test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

//碎片activity
public class MainActivity extends FragmentActivity implements OnClickListener {

	// 三个点击
	public RadioButton radio_button_1, radio_button_2, radio_button_3;
	// 一个动态加载fragment的布局
	public FrameLayout layout;
	public RadioGroup radiogroup;
	// 碎片对象
	public Fragment_one fr_one;
	public Fragment_two fr_two;
	public Fragment_Three fr_three;
	// 碎片管理器对象
	public FragmentManager manager;
	// 开启事务的对象
	public FragmentTransaction transaction;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 获得管理器对象
		manager = getSupportFragmentManager();
		// 事务的对象
		transaction = manager.beginTransaction();
		// 点击事件 的各个控件的初始化
		radio_button_1 = (RadioButton) findViewById(R.id.rb_1);
		radio_button_2 = (RadioButton) findViewById(R.id.rb_2);
		radio_button_3 = (RadioButton) findViewById(R.id.rb_3);
		radiogroup = (RadioGroup) findViewById(R.id.rg);
		layout = (FrameLayout) findViewById(R.id.fragment_layout_id);

		// 设置监听
		radio_button_1.setOnClickListener(this);
		radio_button_2.setOnClickListener(this);
		radio_button_3.setOnClickListener(this);
		// 默认有一个碎片已经添加到页面上
		radiogroup.check(R.id.rb_1);// 判断第一个radio_button_1被点击
		fr_one = new Fragment_one();
		// 替换
		transaction.replace(R.id.fragment_layout_id, fr_one);
		// 提交
		transaction.commit();

	}

	@Override
	public void onClick(View v) {
		// 获得管理器对象
		manager = getSupportFragmentManager();
		// 事务的对象
		transaction = manager.beginTransaction();
		switch (v.getId()) {
		// 把对应的第1个fragment给添加过来
		case R.id.rb_1:
			fr_one = new Fragment_one();
			// 移除掉当前的fragment
			// hideFragment(transaction);
			hideone(transaction);
			// 替换
			transaction.replace(R.id.fragment_layout_id, fr_one);
			// 提交
			transaction.commit();

			break;
		// 把对应的第2个fragment给添加过来
		case R.id.rb_2:
			fr_two = new Fragment_two();
			// 移除掉当前的fragment
			// hideFragment(transaction);
			hideone(transaction);
			// 替换
			transaction.replace(R.id.fragment_layout_id, fr_two);
			// 提交
			transaction.commit();
			break;
		// 把对应的第3个fragment给添加过来
		case R.id.rb_3:
			fr_three = new Fragment_Three();
			// 移除掉当前的fragment
			// hideFragment(transaction);
			hideone(transaction);
			// 替换
			transaction.replace(R.id.fragment_layout_id, fr_three);
			// 提交
			transaction.commit();
			break;
		default:
			break;
		}

	}

	// 系统提供hide
	public void hideone(FragmentTransaction transaction) {
		if (fr_one != null) {
			transaction.hide(fr_one);
		} else if (fr_two != null) {
			transaction.hide(fr_two);
		} else if (fr_three != null) {
			transaction.hide(fr_three);
		}
	}

	// 点击某一个按钮的时候，隐藏fragment
	public void hideFragment(FragmentTransaction transaction) {
		if (fr_one != null) {
			transaction.remove(fr_one);
		} else if (fr_two != null) {
			transaction.remove(fr_two);
		} else if (fr_three != null) {
			transaction.remove(fr_three);
		}
	}

}
