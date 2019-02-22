package com.pb.android_107_5_01_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	// 下拉框的实例
	private Spinner sp_1, sp_2, sp_3;
	// 适配器
	private ArrayAdapter<String> adapter_1, adapter_2, adapter_3;
	// 创建一个集合
	private List<String> list_1, list_2, list_3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始实例化方法
		initView();
		// 初始化数据的方法
		initData();
	}
	private void initView() {
		sp_1 = (Spinner) findViewById(R.id.spinner_id_1);
		sp_2 = (Spinner) findViewById(R.id.spinner_id_2);
		sp_3 = (Spinner) findViewById(R.id.spinner_id_3);
	}

	private void initData() {
		// 创建集合对象
		list_1 = new ArrayList<String>();
		list_2 = new ArrayList<String>();
		list_3 = new ArrayList<String>();
		// 往集合中添加数据
		dataSave();
		// 把list放到适配器中
		sysAdapter();
	}
	private void dataSave() {
		// 集合1
		list_1.add("住宅");
		list_1.add("别墅");
		list_1.add("写字楼");
		list_1.add("商务楼");
		list_1.add("教学楼");
		// 集合2
		list_2.add("厂房");
		list_2.add("土地");
		list_2.add("商场");
		list_2.add("楼盘");
		// 集合3
		list_3.add("大厦");
		list_3.add("政府");
		list_3.add("学校");
		list_3.add("医院");
	}
	private void sysAdapter() {
		// 实例化adpter把list和adapter绑定到一块了
		adapter_1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_1);
		adapter_2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_2);
		adapter_3 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list_3);
		// 下拉框
		adapter_1.setDropDownViewResource(android.R.layout.simple_list_item_1);
		adapter_2.setDropDownViewResource(android.R.layout.simple_list_item_1);
		adapter_3.setDropDownViewResource(android.R.layout.simple_list_item_1);
		// 把adapter放到spinner中去
		sp_1.setAdapter(adapter_1);
		sp_2.setAdapter(adapter_2);
		sp_3.setAdapter(adapter_3);
		// 当我点击spinner下拉出来的某一个item的时候
		sp_1.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				 // 判断我选中的是哪一个
				 if (position == 0) {
				 // 第二个页面
				 Intent intent = new Intent(MainActivity.this,
				 NewActivity.class);
				 startActivity(intent);
				 }
//				switch ((int) id) {
//				case 0:
//					Intent intent = new Intent(MainActivity.this,
//							NewActivity.class);
//					startActivity(intent);
//					break;
//				case 1:
//					Intent intent1 = new Intent(MainActivity.this,
//							NewActivity.class);
//					startActivity(intent1);
//					break;
//				case 2:
//					Intent intent2 = new Intent(MainActivity.this,
//							NewActivity.class);
//					startActivity(intent2);
//					break;
//				case 3:
//					Intent intent3 = new Intent(MainActivity.this,
//							NewActivity.class);
//					startActivity(intent3);
//					break;
//
//				default:
//					break;
//				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

	}

}
