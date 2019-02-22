package com.example.fristac;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends Activity {

	private TextView textview1;
	private TextView textview2;
	private TextView textview3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twoactivity);
		textview1 = (TextView) findViewById(R.id.tex_1);
		textview2 = (TextView) findViewById(R.id.tex_2);
		textview3 = (TextView) findViewById(R.id.tex_3);

		Intent intent = getIntent();

		Bundle bundle = intent.getExtras();
		String name11 = bundle.getString("name");
		int age11 = bundle.getInt("age");
		char sex11 = bundle.getChar("sex");
		textview1.setText(name11);
		textview2.setText(String.valueOf(age11));
		textview3.setText(String.valueOf(sex11));
	}

}
