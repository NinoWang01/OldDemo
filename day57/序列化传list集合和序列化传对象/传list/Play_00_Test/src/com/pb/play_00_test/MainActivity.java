package com.pb.play_00_test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapter.MyAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	// 创建集合
	public List<Map<String, Object>> list = null;
	// 放数据的name数组
	String[] str_name = new String[] { "张三", "李四", "王族", "钱前", "李二", "赵飞",
			"张三丰", "王重阳", "杨过" };
	// 放数据的phone数组
	String[] str_phone = new String[] { "11111111111", "22222222222",
			"33333333333", "44444444444", "55555555555", "66666666666",
			"77777777777", "88888888888", "99999999999" };
	// 放数据的头像数组
	int[] str_icon = new int[] { R.drawable.book, R.drawable.check,
			R.drawable.image, R.drawable.news, R.drawable.phone_all,
			R.drawable.phone_check, R.drawable.phone_fashion,
			R.drawable.phone_used, R.drawable.shopping, };
	// 声明adapter
	public MyAdapter adapter;
	public Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化集合对象
		list = new ArrayList<Map<String, Object>>();

		button = (Button) findViewById(R.id.list_item_id);
		button.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.list_item_id:
			for (int i = 0; i < str_icon.length; i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("name", str_name[i]);
				map.put("phone", str_phone[i]);
				map.put("icon", str_icon[i]);
				// 把map放入list中去
				list.add(map);
			}

			Bundle bundle = new Bundle();
			bundle.putSerializable("data", (Serializable) list);
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtras(bundle);
			startActivity(intent);
			// startActivityForResult(intent, 0);

			break;

		default:
			break;
		}

	}

}
