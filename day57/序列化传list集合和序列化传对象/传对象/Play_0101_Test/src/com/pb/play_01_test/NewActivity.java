package com.pb.play_01_test;

import com.pb.play_01_test.bean.Person;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends Activity {
	public TextView mTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_page);

		mTextView = (TextView) findViewById(R.id.text_Serializable_id);
		/*
		 * Intent intent = getIntent(); 
		 * Bundle bundle = intent.getExtras();
		 * Person p2 = (Person) bundle.getSerializable("myPerson");
		 */
//		Person mPerson = (Person) getIntent().getSerializableExtra("myPerson");
		 Intent intent = getIntent(); 
		 Bundle bundle = intent.getExtras();
		 Person p2 = (Person) bundle.getSerializable("myPerson");
		mTextView.setText("You name is: " + p2.getName() + "\n"
				+ "You age is: " + p2.getAge());

	}

}
