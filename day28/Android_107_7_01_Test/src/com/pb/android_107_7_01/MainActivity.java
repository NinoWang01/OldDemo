package com.pb.android_107_7_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	// 声明所有的控件
	public EditText edit_name, edit_password;
	public Button button_save, button_search;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化这几个控件
		edit_name = (EditText) findViewById(R.id.edit_text_id);
		edit_password = (EditText) findViewById(R.id.edit_text_id_1);
		button_save = (Button) findViewById(R.id.button_save_id);
		button_save.setOnClickListener(this);
		button_search = (Button) findViewById(R.id.button_save_id_1);
		button_search.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_save_id:
			// 首先获得用户输入的内容
			String name = edit_name.getText().toString().trim();
			// 获得输入密码
			String password = edit_password.getText().toString().trim();
			// 写内容 
			try {
				FileOutputStream fos = openFileOutput("data.txt",
						Context.MODE_APPEND);
				// 写用户名
				fos.write(name.getBytes());
				// 写密码进文件
				fos.write(password.getBytes());
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 吐丝
			Toast.makeText(MainActivity.this, "保存文件成功！！！", Toast.LENGTH_LONG)
					.show();
			break;
		case R.id.button_save_id_1:
			String str = "";
			// 读写入文件的内容
			try {
				FileInputStream fis = openFileInput("data.txt");
				// 缓存
				byte[] buffer = new byte[fis.available()];
				fis.read(buffer);
				str = new String(buffer);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Toast.makeText(MainActivity.this, "查看保存内容" + str, Toast.LENGTH_LONG)
					.show();
			break;
		default:
			break;
		}
	}
}
