package com.pb.android_107_25_02_test;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

//activity和fragment之间的通信
public class MainActivity extends Activity implements OnClickListener {
	// fragmentManager
	public FragmentManager manager;
	public MyFragment myFragment;
	public Button button;
	public LinearLayout layout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button_get_vaule_id);
		button.setOnClickListener(this);
		layout = (LinearLayout) findViewById(R.id.linearlayout_id);// 没实例化
		// 获取fragment管理器对象
		manager = getFragmentManager();
		// 创建myFragment实例
		myFragment = new MyFragment();
		// 开启一个事务
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.linearlayout_id, myFragment);
		// 传值,封装一下数据
		Bundle bundle = new Bundle();
		// 从activity向fragment
		bundle.putString("MainActivity", "MainActivity的数据........");
		// 调用fragment的一个方法
		myFragment.setArguments(bundle);
		// 提交之前
		transaction.commit();
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_get_vaule_id:
			// 处理点击按钮取的值bundle
			Bundle bundle = myFragment.getArguments();
			// 得到bundle中的具体的数据//键从fragment传过来的
			String vaules = bundle.getString("MyFragment");
			Toast.makeText(MainActivity.this, "数据来自:" + vaules,
					Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}

	}

}
