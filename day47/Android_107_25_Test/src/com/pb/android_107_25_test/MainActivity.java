package com.pb.android_107_25_test;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("MainActivity---------------->",
				"--------------onCreate()方法被调用了----------------");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("MainActivity---------------->",
				"--------------onStart()方法被调用了----------------");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("MainActivity---------------->",
				"--------------onRestart()方法被调用了----------------");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("MainActivity---------------->",
				"--------------onResume()方法被调用了----------------");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("MainActivity---------------->",
				"--------------onPause()方法被调用了----------------");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("MainActivity---------------->",
				"--------------onStop()方法被调用了----------------");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("MainActivity---------------->",
				"--------------onDestroy()方法被调用了----------------");
	}

}
