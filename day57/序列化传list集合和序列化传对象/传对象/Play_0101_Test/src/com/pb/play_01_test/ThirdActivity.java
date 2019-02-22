package com.pb.play_01_test;

import com.pb.play_01_test.bean.Book;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	public TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_page);
		mTextView = (TextView) findViewById(R.id.text_Parcelable_id);
		Book mBook = (Book) getIntent().getParcelableExtra("mBook");
		mTextView.setText("Book name is: " + mBook.getBookName() + "\n"
				+ "Author is: " + mBook.getAuthor() + "\n" + "PublishTime is: "
				+ mBook.getPublishTime());
	}

}
