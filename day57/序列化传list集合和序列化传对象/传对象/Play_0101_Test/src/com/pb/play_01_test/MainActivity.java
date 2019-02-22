package com.pb.play_01_test;

import com.pb.play_01_test.bean.Book;
import com.pb.play_01_test.bean.Person;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button button, button_1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化button
		button = (Button) findViewById(R.id.gei_object_id);
		button.setOnClickListener(this);
		button_1 = (Button) findViewById(R.id.button1);
		button_1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.gei_object_id:

			Person p = new Person();
			p.setName("张三丰");
			p.setAge(120);
			p.setSex('男');
			Intent mIntent = new Intent(this, NewActivity.class);
			Bundle mBundle = new Bundle();
			mBundle.putSerializable("myPerson", p);
			mIntent.putExtras(mBundle);
			startActivity(mIntent);
			break;
		case R.id.button1:
			Book mBook = new Book();
			mBook.setBookName("a man from mars");
			mBook.setAuthor("james");
			mBook.setPublishTime(2014);
			Intent myIntent = new Intent(this, ThirdActivity.class);
			Bundle myBundle = new Bundle();
			myBundle.putParcelable("mBook", mBook);
			myIntent.putExtras(myBundle);
			startActivity(myIntent);
			break;
		default:
			break;
		}

	}

}
