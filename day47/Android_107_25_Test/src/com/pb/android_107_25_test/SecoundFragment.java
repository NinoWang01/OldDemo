package com.pb.android_107_25_test;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecoundFragment extends Fragment {
	

	// 保证activity实例创建成功后，回调的方法
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("SecoundFragment---------------->",
				"--------------onActivityCreated()方法被调用了----------------");
	}

	// 是让fragment和activity之间建立关联时被回调
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("SecoundFragment---------------->",
				"--------------onAttach()方法被调用了----------------");
	}

	// 创建fragment实例的时候被回调
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("SecoundFragment---------------->",
				"--------------onCreate()方法被调用了----------------");
	}

	// 这个方法稍微特殊点，绘制fragment对应视图的时候被回调
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("SecoundFragment---------------->",
				"--------------onCreateView()方法被调用了----------------");
		// 添加一个视图
		View view = inflater.inflate(R.layout.secound_fragment, container, false);
		// 结果返回
		return view;
	}

	// 销毁当前fragment实例的时候被回调
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("SecoundFragment---------------->",
				"--------------onDestroy()方法被调用了----------------");
	}

	// 解除fragment绘制的视图的时候被回调
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d("SecoundFragment---------------->",
				"--------------onDestroyView()方法被调用了----------------");
	}

	// 解除fragment和activity之间的关联的时候被回调
	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("SecoundFragment---------------->",
				"--------------onDetach()方法被调用了----------------");
	}

	// fragment市区焦点的时候被回调
	@Override
	public void onPause() {
		super.onPause();
		Log.d("SecoundFragment---------------->",
				"--------------onPause()方法被调用了----------------");
	}

	// fragment获得焦点的时候别回调
	@Override
	public void onResume() {
		super.onResume();
		Log.d("SecoundFragment---------------->",
				"--------------onResume()方法被调用了----------------");
	}

	// fragment启动的时候被回调
	@Override
	public void onStart() {
		super.onStart();
		Log.d("SecoundFragment---------------->",
				"--------------onStart()方法被调用了----------------");
	}

	// fragment停止的时候被回调
	@Override
	public void onStop() {
		super.onStop();
		Log.d("SecoundFragment---------------->",
				"--------------onStop()方法被调用了----------------");
	}

	
	
	
	
	

}
