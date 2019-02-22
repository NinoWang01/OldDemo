package com.pb.android_107_21_02_test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// 创建iamgeView
	public ImageView image_view;
	public Bitmap bitmap1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image_view = (ImageView) findViewById(R.id.image_view_id);
		// 从资源文件中解析一张图过来
		Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),
				R.drawable.guagua);

		bitmap1 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(),
				bitmap2.getConfig());
		// 创建一个画布
		Canvas canvas = new Canvas(bitmap1);
		// 创建画笔
		Paint paint = new Paint();
		// 给画笔设置一个颜色
		paint.setColor(Color.BLUE);
		// 设置锯齿效果
		paint.setAntiAlias(true);
		// 的到Matrix的实例
		Matrix matrix = new Matrix();
		// 在bitmap1上设置图片
		canvas.drawBitmap(bitmap2, matrix, paint);
		// 把图片放到imageView当中去
		image_view.setImageBitmap(bitmap1);
		// 监听用户的行为
		image_view.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:// 手指碰到图片
					Toast.makeText(MainActivity.this, "手指触碰了",
							Toast.LENGTH_LONG).show();
					break;
				// 处理用户手指的滑动10*10
				case MotionEvent.ACTION_MOVE:
					Toast.makeText(MainActivity.this, "手指移动", Toast.LENGTH_LONG)
							.show();
					// 监听用户手指滑动到了哪一个点x,y
					int x = (int) event.getX();

					int y = (int) event.getY();
					// 循环判断手指的运动
					for (int i = -10; i < 10; i++) {
						for (int j = -10; j < 10; j++) {
							// 判断
							if (Math.sqrt(((i * i) + (j * j))) <= 10) {
								// 图片的一个真实移动
								bitmap1.setPixel(x + i, y + i,
										Color.TRANSPARENT);
							} else if ((x + i) > 10 && (y + i) > 10) {
								Toast.makeText(MainActivity.this, "手指离开了",
										Toast.LENGTH_LONG).show();

							}

						}
					}
					// 设置新的图片
					image_view.setImageBitmap(bitmap1);
				case MotionEvent.ACTION_UP:// 手指的离开
					Toast.makeText(MainActivity.this, "手指离开了",
							Toast.LENGTH_LONG).show();

					break;
				default:
					break;
				}

				return true;
			}
		});

	}

}
