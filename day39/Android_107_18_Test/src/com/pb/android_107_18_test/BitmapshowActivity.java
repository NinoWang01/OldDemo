package com.pb.android_107_18_test;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

//处理图片显示的页面
public class BitmapshowActivity extends Activity {

	public ImageView iamge_view;
	public RequestQueue myRequestQueue;// 请求队列
	// 请求对象
	public ImageRequest myImageRequest;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_show);
		// 实例化控件
		iamge_view = (ImageView) findViewById(R.id.imageView_id);
		// 获得bundle传值
		Bundle bundle = getIntent().getExtras();
		// 获得请求地址
		String imaurl = ImageViewUrl.imageUrls[bundle.getInt("position")];
		// 获得volley请求队列
		myRequestQueue = Volley.newRequestQueue(this);
		// 获得myImageRequest
		myImageRequest = new ImageRequest(imaurl,
				new Response.Listener<Bitmap>() {

					@Override
					public void onResponse(Bitmap response) {
						// 请求图片成功，显示这张图片
						iamge_view.setImageBitmap(response);
					}
				}, 0, 0, Config.RGB_565, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// 请求图片失败，显示任意一张图或者占位图
						iamge_view.setImageResource(R.drawable.ic_launcher);
					}
				});
		// 把请求对象添加到请求队列当中去
		myRequestQueue.add(myImageRequest);

	}

	// 退出应用，或者应用挂起的时候，要把volley

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 暴力
		myRequestQueue = null;
		myImageRequest = null;

	}

	// 点击事件的一个方法
	public void showPage(View v) {
		switch (v.getId()) {
		// 当我点击关闭的时候的处理
		case R.id.text_show_id:
			finish();
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_quit:
			finish();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
