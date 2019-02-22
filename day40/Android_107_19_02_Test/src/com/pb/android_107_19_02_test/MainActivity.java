package com.pb.android_107_19_02_test;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.ResType;
import com.lidroid.xutils.view.annotation.ResInject;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	// XUtils的注解,实例化了控件
	@ViewInject(R.id.text_view_id)
	public TextView text_view;
	// 引用资源文件的写法
	@ResInject(id = R.string.aaa, type = ResType.String)
	public String str;
 
	public ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text_view.setText("afgasdfg");
		ViewUtils.inject(this); // 注入view和事件

	}

	@OnClick({ R.id.button1, R.id.button2, R.id.button3 })
	public void onClickButton(View v) {
		switch (v.getId()) {
		case R.id.button1:

			break;
		case R.id.button2:

			break;
		case R.id.button3:

			break;
		default:
			break;
		}

	}

}
