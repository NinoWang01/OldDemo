package com.pb.android_107_8_test;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	public Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button_view_id);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_view_id:
			// 产生一个对话框
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			// 给对话框添加图标
			builder.setIcon(R.drawable.ic_launcher);
			builder.setTitle("这是一个对话框");
			builder.setMessage("对话框中的内容");
			// 确定监听对话框
			builder.setPositiveButton("确定",
					new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// 处理整个对话框的业务逻辑

						}
					});
			// 取消
			builder.setNegativeButton("取消",
					new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub

						}
					});

			// 对话框的显示
			builder.show();
			break;
		default:
			break;
		}
	}

}
