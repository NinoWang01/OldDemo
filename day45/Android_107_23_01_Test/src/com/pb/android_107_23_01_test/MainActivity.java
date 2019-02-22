package com.pb.android_107_23_01_test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {

	public ImageView image_view, image_view2, image_view3, image_view4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image_view = (ImageView) findViewById(R.id.iamge_view_1);
		image_view.setOnClickListener(this);
		image_view2 = (ImageView) findViewById(R.id.iamge_view_2);
		image_view2.setOnClickListener(this);
		image_view3 = (ImageView) findViewById(R.id.iamge_view_3);
		image_view3.setOnClickListener(this);
		image_view4 = (ImageView) findViewById(R.id.iamge_view_4);
		image_view4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iamge_view_1:
			Animation alpha_jianbian = AnimationUtils.loadAnimation(this,
					R.anim.alpha_animation);
			// 给图片设置动画
			image_view.startAnimation(alpha_jianbian);

			break;
		case R.id.iamge_view_2:
			Animation rotate_jianbian = AnimationUtils.loadAnimation(this,
					R.anim.rotate_animation);
			// 给图片设置动画
			image_view2.startAnimation(rotate_jianbian);
			break;
		case R.id.iamge_view_3:
			Animation scale_jianbian = AnimationUtils.loadAnimation(this,
					R.anim.scale_animation);
			// 给图片设置动画
			image_view3.startAnimation(scale_jianbian);
			break;
		case R.id.iamge_view_4:
			Animation translate_jianbian = AnimationUtils.loadAnimation(this,
					R.anim.translate_animation);
			// 给图片设置动画
			image_view4.startAnimation(translate_jianbian);
			break;
		default:
			break;
		}

	}

}
