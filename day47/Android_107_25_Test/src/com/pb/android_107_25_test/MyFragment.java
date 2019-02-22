package com.pb.android_107_25_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyFragment extends Fragment {
	public ListView list_view;
	public List<String> list;
	public ArrayAdapter<String> adapter;

	// 保证activity实例创建成功后，回调的方法
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("MyFragment---------------->",
				"--------------onActivityCreated()方法被调用了----------------");
	}

	// 是让fragment和activity之间建立关联时被回调
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("MyFragment---------------->",
				"--------------onAttach()方法被调用了----------------");
	}

	// 创建fragment实例的时候被回调,数据的初始化
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("MyFragment---------------->",
				"--------------onCreate()方法被调用了----------------");
//		initView();  数据的初始化
		list = new ArrayList<String>();
		// 循环
		for (int i = 0; i < 100; i++) {
			list.add("第" + i + "条数据");
		}
		// 在fragment中获取activity的实例方式一
		// getActivity()
		// 获取activity实例的方式二
		MainActivity activity = (MainActivity) getActivity();
		/*
		 * getActivity():代表上下文context activity:代表上下文context
		 */
		adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, list);
	}
	// 这个方法稍微特殊点，绘制fragment对应视图的时候被回调
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("MyFragment---------------->",
				"--------------onCreateView()方法被调用了----------------");
		// 添加一个视图
		View view = inflater.inflate(R.layout.my_fragment, container, false);
		// 实例化list_view
		list_view = (ListView) view.findViewById(R.id.list_view_id);
		list_view.setAdapter(adapter);
		// 结果返回
		return view;
	}

	// 销毁当前fragment实例的时候被回调
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("MyFragment---------------->",
				"--------------onDestroy()方法被调用了----------------");
	}

	// 解除fragment绘制的视图的时候被回调
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d("MyFragment---------------->",
				"--------------onDestroyView()方法被调用了----------------");
	}

	// 解除fragment和activity之间的关联的时候被回调
	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("MyFragment---------------->",
				"--------------onDetach()方法被调用了----------------");
	}

	// fragment市区焦点的时候被回调
	@Override
	public void onPause() {
		super.onPause();
		Log.d("MyFragment---------------->",
				"--------------onPause()方法被调用了----------------");
	}

	// fragment获得焦点的时候别回调
	@Override
	public void onResume() {
		super.onResume();
		Log.d("MyFragment---------------->",
				"--------------onResume()方法被调用了----------------");
	}

	// fragment启动的时候被回调
	@Override
	public void onStart() {
		super.onStart();
		Log.d("MyFragment---------------->",
				"--------------onStart()方法被调用了----------------");
	}

	// fragment停止的时候被回调
	@Override
	public void onStop() {
		super.onStop();
		Log.d("MyFragment---------------->",
				"--------------onStop()方法被调用了----------------");
	}

}
