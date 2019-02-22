package com.pb.android_107_7_02_test;

import java.util.Map;

import com.pb.android_107_7_02_test.tools.Utils;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	public EditText edit_name, edit_password;
	public Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始化控件的方法
		init();
		Map<String, String> mm = Utils.getData(this);
		// 放到EditText上面去
		if (mm != null) {
			edit_name.setText(mm.get("na"));
			edit_password.setText(mm.get("pa")); 
		} else {
			Toast.makeText(this, "读取失败，重新输入用户名和密码", Toast.LENGTH_LONG).show();
		}

	}

	private void init() {
		// 实例化控件
		edit_name = (EditText) findViewById(R.id.edit_text_id);
		edit_password = (EditText) findViewById(R.id.edit_text_id_1);
		button = (Button) findViewById(R.id.button_s_id);
		button.setOnClickListener(this);

	}
	@Override
	public void onClick(View v) {
		// 获得输入框中的name
		String name = edit_name.getText().toString().trim();
		// 获得password
		String password = edit_password.getText().toString().trim();

		// 判断输入框中的内容为不为空
		if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password)) {

			Toast.makeText(MainActivity.this, "用户名或密码不能为空", Toast.LENGTH_LONG)
					.show();
		}
		// 把用户名和密码保存到data.xml文件当中去

		boolean success = Utils.saveData(MainActivity.this, name, password);
		if (success) {
			Toast.makeText(this, "存储成功 " + success, Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "存储 失败 " + success, Toast.LENGTH_LONG).show();
		}

	}

}
