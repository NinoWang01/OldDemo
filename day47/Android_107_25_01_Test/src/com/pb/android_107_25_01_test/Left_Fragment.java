package com.pb.android_107_25_01_test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Left_Fragment extends Fragment implements OnClickListener {

	//改变的是内容
	public Button button1, button2, button3;
	public FragmentManager manager;
	public Right_Fragment right_fragment;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.left_fragment, container, false);
		MainActivity activity = (MainActivity) getActivity();
		// 获得一个fragment管理器
		manager = activity.getFragmentManager();

		// 控件的实例化
		button1 = (Button) view.findViewById(R.id.button1);
		button2 = (Button) view.findViewById(R.id.button2);
		button3 = (Button) view.findViewById(R.id.button3);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		// 获得右边fragment的实例
		right_fragment = (Right_Fragment) manager
				.findFragmentById(R.id.right_fragment_id);
		switch (v.getId()) {

		case R.id.button1:

			right_fragment.rightFragmentShowTextVeiw(1);
			break;
		case R.id.button2:

			right_fragment.rightFragmentShowTextVeiw(2);

			break;
		case R.id.button3:

			right_fragment.rightFragmentShowTextVeiw(3);

			break;
		default:
			break;
		}

	}

}
