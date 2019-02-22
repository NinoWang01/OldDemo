package com.pb.android_107_21_01_test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

//public class BitmapView extends View {
//	public Context context;
//	public Bitmap bitmap;
//
//	public BitmapView(Context context) {
//		super(context);
//		this.context = context;
//		// 设置当前的位图视图是否可以获得焦点
//		setFocusable(true);
//
//	}
//
//	public void onDraw(Canvas canvas) {
//
//		Bitmap bp = BitmapFactory.decodeResource(context.getResources(),
//				R.drawable.pic);
//		// 做一个缩放
//		bitmap = Bitmap.createScaledBitmap(bp, getWidth() / 2, getHeight() / 2,
//				true);
//		// 获得画笔
//		Paint paint = new Paint();
//		// 设置画笔的锯齿效果
//		paint.setAntiAlias(true);
//		// 绘制指定的图片
//		canvas.drawBitmap(bitmap, 0, 0, paint);
//
//	}
//
//}
