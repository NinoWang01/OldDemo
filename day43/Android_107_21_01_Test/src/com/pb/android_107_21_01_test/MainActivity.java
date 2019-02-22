package com.pb.android_107_21_01_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.os.Bundle;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new BitmapView(this));// MainActivity往添加视图

	}

	public class BitmapView extends View {
		public BitmapView(Context context) {
			super(context);
		}
		public void onDraw(Canvas canvas) {
			Bitmap bp = drawTextBitmap("我是通过画笔绘制到图片上来的", R.drawable.pic);

			// 绘制完后的图设置一个存储位置
			try {
				FileOutputStream fos = new FileOutputStream(new File(
						"mnt/sdcard/haohao.jpg"));

				bp.compress(CompressFormat.JPEG, 100, fos);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 获得画笔
			Paint paint = new Paint();
			// 绘制指定的图片
			canvas.drawBitmap(bp, 0, 0, paint);
		}
		// 自定义一个处理图片的方法（改变图片）在图片上绘制一句话
		public Bitmap drawTextBitmap(String str, int resid) {
			// 先获取一个Bitmap对象
			Bitmap bp = BitmapFactory.decodeResource(getResources(), resid);
			Bitmap bitmap = Bitmap.createScaledBitmap(bp, getWidth(),
					getHeight(), true);
			// 获取画布
			Canvas canvas = new Canvas(bitmap);
			// 获取画笔
			Paint paint = new Paint();
			// 设置要绘制内容的颜色
			paint.setColor(Color.RED);
			// 在画布上绘制字体
			canvas.drawText(str, 100, 100, paint);
			// 绘制完的图给它返回
			return bitmap;

		}
	}
}
