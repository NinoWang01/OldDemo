package com.pb.android_107_25_01_test;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Right_Fragment extends Fragment {
	public TextView text_view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.right_fragment, container, false);
		text_view = (TextView) view.findViewById(R.id.text_view_id);

		return view;
	}

	// 声明一个让fragment中textView本内容变化的方法

	public void rightFragmentShowTextVeiw(int a) {

		switch (a) {
		case 1:
			text_view.setText(R.string.rf_button1);

			break;
		case 2:
			text_view.setText(R.string.rf_button2);
			break;
		case 3:
			text_view.setText(R.string.rf_button3);
			break;

		default:
			break;
		}

	}

}
