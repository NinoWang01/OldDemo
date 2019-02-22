package com.pb.android_107_5_03_test;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	// 点击
	private RelativeLayout layout, layout_1, layout_2, layout_3;
	private ImageView image_view, image_view_1, image_view_2, image_view_3;
	private TextView text_view, text_view_1, text_view_2, text_view_3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		layout = (RelativeLayout) findViewById(R.id.relative_layout_id);
		layout.setOnClickListener(this);
		layout_1 = (RelativeLayout) findViewById(R.id.id_111);
		layout_1.setOnClickListener(this);
		layout_2 = (RelativeLayout) findViewById(R.id.id_222);
		layout_2.setOnClickListener(this);
		layout_3 = (RelativeLayout) findViewById(R.id.id_333);
		layout_3.setOnClickListener(this);

		image_view = (ImageView) findViewById(R.id.image_view_id);
		image_view_1 = (ImageView) findViewById(R.id.image_view_id_1);
		image_view_2 = (ImageView) findViewById(R.id.image_view_id_2);
		image_view_3 = (ImageView) findViewById(R.id.image_view_id_3);

		text_view = (TextView) findViewById(R.id.text_view_id);
		text_view_1 = (TextView) findViewById(R.id.text_view_id_1);
		text_view_2 = (TextView) findViewById(R.id.text_view_id_2);
		text_view_3 = (TextView) findViewById(R.id.text_view_id_3);

	}

	public void hao(ImageView image, ImageView image1, ImageView image2,
			ImageView image3, TextView text, TextView text1, TextView text2,
			TextView text3) {

		image1.setSelected(false);
		image2.setSelected(false);
		image3.setSelected(false);
		text1.setTextColor(Color.GRAY);
		text2.setTextColor(Color.GRAY);
		text3.setTextColor(Color.GRAY);
		// 被点击的要变红色
		image.setSelected(true);
		text.setTextColor(Color.RED);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 点击事件，onClick（）方法当中要去判断
		case R.id.relative_layout_id:
			hao(image_view, image_view_1, image_view_2, image_view_3,
					text_view, text_view_1, text_view_2, text_view_3);
			break;
		case R.id.id_111:
			hao(image_view_1, image_view, image_view_2, image_view_3,
					text_view_1, text_view, text_view_2, text_view_3);
			break;
		case R.id.id_222:
			hao(image_view_2, image_view, image_view_1, image_view_3,
					text_view_2, text_view, text_view_1, text_view_3);
			break;
		case R.id.id_333:
			hao(image_view_3, image_view, image_view_1, image_view_2,
					text_view_3, text_view, text_view_1, text_view_2);
			break;
		default:
			break;
		}

	}
}
