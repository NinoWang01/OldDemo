package com.pb.android_107_9_01_test;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		// 产生一个登陆自定义的对话框
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		// 设置标
		builder.setTitle("用户登陆：");
		// 图标
		builder.setIcon(R.drawable.ic_launcher);
		// 布局加载器
		LayoutInflater inflater = this.getLayoutInflater();
		// 产生一个视图，视图要放到对话框上去
		builder.setView(inflater.inflate(R.layout.activity_main, null));
		// 添加按钮
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// 处理对话框的业务
			}
		});
		builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		//对话框的创建
		builder.create();
		builder.show();
	}
}
