package com.pb.android_107_23_02_test;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	public ImageView image_view;

	public AnimationDrawable animd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image_view = (ImageView) findViewById(R.id.iamge_view_id);
		//
		animd = (AnimationDrawable) image_view.getBackground();
	}

	public void onClickButton(View v) {
		switch (v.getId()) {
		case R.id.button_id:

			// 判断
			if (!animd.isRunning()) {
				// 帧动画开始运动
				animd.start();
				// 点击按钮之后，要求按钮的图片
				findViewById(R.id.button_id).setBackgroundResource(
						android.R.drawable.ic_media_pause);
			} else {

				animd.stop();
				findViewById(R.id.button_id).setBackgroundResource(
						android.R.drawable.ic_media_play);
			}

			break;

		default:
			break;
		}

	}

}
