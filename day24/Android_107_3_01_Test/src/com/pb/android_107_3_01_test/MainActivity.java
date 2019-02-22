package com.pb.android_107_3_01_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity implements OnClickListener {
	private Button button_1, button_11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button_1 = (Button) findViewById(R.id.button_id);
		button_1.setOnClickListener(this);
		button_11 = (Button) findViewById(R.id.button1);
		button_11.setOnClickListener(this);
	}
	// 对应菜单的重写方法
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// 布局加载器的一个实例
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	// 当你点击任意一个菜单的时候的，一个事件处理重写方法
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings_1:
			Toast.makeText(MainActivity.this, "菜单1被点击了", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.action_settings_2:
			Toast.makeText(MainActivity.this, "菜单2被点击了", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.action_settings_3:
			Toast.makeText(MainActivity.this, "菜单3被点击了", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.action_settings_4:
			Toast.makeText(MainActivity.this, "菜单4被点击了", Toast.LENGTH_SHORT)
					.show();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_id:
			// 显示启动另一个页面
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			// 调用一个方法启动
			startActivity(intent);
			break;
		case R.id.button1:
			// 隐式的启动另一个页面,
			Intent intent1 = new Intent("com.pb.android_107_3_01_test.ACTION_START");
			// 调用一个方法启动
			startActivity(intent1);
			break;
		default:
			break;
		}

	}

	// public void destoryActivity(View v) {
	// switch (v.getId()) {
	// case R.id.button_id:
	// // 销毁实例
	// finish();
	// break;
	//
	// default:
	// break;
	// }
	//
	// }

}
