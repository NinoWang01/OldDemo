package com.pb.android_107_4_03_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThridActivity extends Activity implements OnClickListener {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_page);
		button = (Button) findViewById(R.id.thrid_id);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.thrid_id:
			// 给启动它的activity返回值
			// intent的实例
			Intent intent = new Intent();
			intent.putExtra("ThridActivity", "是来自ThridActivity的返回数据");
			// 通过setResult()
			setResult(1, intent);
			// 处理掉当前activity实例
			finish();

			break;

		default:
			break;
		}

	}

}
