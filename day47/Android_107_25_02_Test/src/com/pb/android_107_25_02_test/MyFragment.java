package com.pb.android_107_25_02_test;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MyFragment extends Fragment {

	public Button button2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.my_fragment, container, false);
		button2 = (Button) view.findViewById(R.id.button_id);
		// 设置一个监听
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 先获得一个bundle实例
				Bundle bundle = getArguments();
				// 得到bundle中的值
				String str = bundle.getString("MainActivity");
				// 查看
				Toast.makeText(getActivity(), "数据来自：" + str, Toast.LENGTH_LONG)
						.show();

			}
		});
		// 从fragment向activity创智
		Bundle bundle2 =getArguments();
		bundle2.putString("MyFragment", "MyFragment的数据。。。。。。。14363467");
		

		return view;
	}

}
