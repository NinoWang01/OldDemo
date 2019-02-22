package com.pb.android_107_23_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {
	public ImageView image_view_1, image_view_2;

	//消失
	public ScaleAnimation a_animation = new ScaleAnimation(1, 0, 1, 1,
			Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT,
			0.5f);
	//显示
	public ScaleAnimation b_animation = new ScaleAnimation(0, 1, 1, 1,
			Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT,
			0.5f);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image_view_1 = (ImageView) findViewById(R.id.iamge_view_id_1);
		image_view_2 = (ImageView) findViewById(R.id.iamge_view_id_2);
		// 初始化动画的方法
		init();

		// 做第一次进入的判断，无论显示的是第一张还是第二张,当我点击的时候
		findViewById(R.id.frame_layout_id).setOnClickListener(
				new OnClickListener() {
					// 做第一次进入的判断
					@Override
					public void onClick(View v) {
						// 判断
						if (image_view_1.getVisibility() == View.VISIBLE) {
							// 产生动画效果
							image_view_1.startAnimation(a_animation);
						} else {
							image_view_2.startAnimation(a_animation);
						}
					}
				});
	}

	// 1
	public void a_imageShow() {
		image_view_1.setVisibility(View.VISIBLE);
		// 2隐藏
		image_view_2.setVisibility(View.INVISIBLE);
	}

	// 2
	public void b_imageShow() {
		// 2显示
		image_view_2.setVisibility(View.VISIBLE);
		// 1隐藏
		image_view_1.setVisibility(View.GONE);
	}

	// 显示第二张图的方法
	// b_imageShow();
	public void init() {
		// 显示第一张图的方法
		a_imageShow();
		// 给动画出现设置一个时间
		a_animation.setDuration(500);
		b_animation.setDuration(500);
		a_animation.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}
			@Override
			public void onAnimationRepeat(Animation animation) {

			}
			//只需要处理结束时的一个效果
			@Override
			public void onAnimationEnd(Animation animation) {
				//先判断1
				if(image_view_1.getVisibility()==View.VISIBLE){
					//把第一个图片的动画去掉
					image_view_1.setAnimation(null);
					//图片2要显示
					b_imageShow();
					//设置了一个动画效果
					image_view_2.startAnimation(b_animation);
				}else{
					//把第2个图片的动画清空去掉
					image_view_2.setAnimation(null);
					//显示1
					a_imageShow();
					image_view_1.startAnimation(b_animation);
				}
			}
		});

	}

}
