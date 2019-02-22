package com.pb.android_107_26_01_test;

import android.os.Bundle;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends Activity {

	// 设置文字
	private String[][] settingText = { 
			{ "主题", "系统壁纸" }, 
			{ "云账户", "百度云账户" },
			{ "通知", "通知栏推送" },
			{ "移动数据", "便携式WIFI热点" }, 
			{ "WLAN", "更多" },
			{ "蓝牙", "可被发现" },
			{ "天气", "温度" }, 
			{ "通话音量", "媒体音量" },
			{ "密码锁定", "定位服务" }, 
			{ "语言", "输入法设置" },
			{ "设置快捷手势", "触摸反馈" },
			{ "设备名称", "存储" } };
	// 设置图标
	private int[] settingicons = {
			R.drawable.theme,
			R.drawable.clound,
			R.drawable.notifycation,
			R.drawable.internet,
			R.drawable.wifi,
			R.drawable.bluetooth,
			R.drawable.wether, 
			R.drawable.volume,
			R.drawable.gps,
			R.drawable.language, 
			R.drawable.gesture,
			R.drawable.info };

	// 碎片管理器对象
	public FragmentManager manager;
	// 碎片事务开启对象
	public FragmentTransaction transaction;

	// 获取图标数组的方法
	public int[] getIcon() {
		return settingicons;
	}

	// 获取图表对应的文字数组的方法
	public String[][] getContentText() {
		return settingText;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 创建两个碎片的对象
		Fragment_Icon fr_icon = new Fragment_Icon();
		Fragment_Content fr_content = new Fragment_Content();
		// 管理器对象
		manager = getFragmentManager();
		// 开启事务对象
		transaction = manager.beginTransaction();
		// 初始化的时候动态加载图标对应的碎片
		transaction.replace(R.id.settint_icon_id, fr_icon);
		// 初始化的时候动态加载内容对应的碎片
		transaction.replace(R.id.settint_content_id, fr_content);
		// 提交
		transaction.commit();
	}

}
