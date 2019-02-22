package com.example.fristac;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
private Button textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1= (Button) findViewById(R.id.txt_1);
        textView1.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.txt_1:
			Intent intent = new Intent(MainActivity.this, TwoActivity.class);
			Bundle bundle =new Bundle();
			bundle.putString("name", "ÕÅÈý·á");
			bundle.putInt("age", 120);
			bundle.putChar("sex", 'ÄÐ');
			intent.putExtras(intent);
			startActivity(intent);
			break;

		default:
			break;
		}
		
		
		
		
	}
    
}
