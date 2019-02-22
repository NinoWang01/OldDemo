package com.com.android_107_20_test;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.bitmap.BitmapDisplayConfig;
import com.lidroid.xutils.bitmap.callback.BitmapLoadFrom;
import com.lidroid.xutils.bitmap.callback.DefaultBitmapLoadCallBack;
//框架里是继承了缓存和异步的操作，不用单独的设置线程池和缓存机制（也可以自己写）
public class xUtilsImageLoading {
	// 先声明处理图片的模块对应实例
	public BitmapUtils bitmapUtils;
	// 获得一个上下文对象
	public Context context;

	// 构造方法
	public xUtilsImageLoading(Context context) {
		//
		this.context = context;
		// 获得BitmapUtils的实例
		bitmapUtils = new BitmapUtils(context);
		// 默认设置图片
		bitmapUtils.configDefaultLoadingImage(R.drawable.logo_new);
		// 加载失败的图片
		bitmapUtils.configDefaultLoadFailedImage(R.drawable.logo_fail);
		// 设置图片的压缩类型
		bitmapUtils.configDefaultBitmapConfig(Bitmap.Config.RGB_565);
	}

	// 图片的回调函数, 当加载到图片的时候，要把图片对应的属兔传进来
	public class MyBitmapLoadCallBack extends
			DefaultBitmapLoadCallBack<ImageView> {
		@Override
		public void onLoadCompleted(ImageView container, String uri,
				Bitmap bitmap, BitmapDisplayConfig config, BitmapLoadFrom from) {
			super.onLoadCompleted(container, uri, bitmap, config, from);
		}

		@Override
		public void onLoadFailed(ImageView container, String uri,
				Drawable drawable) {
			super.onLoadFailed(container, uri, drawable);
		}

		@Override
		public void onLoading(ImageView container, String uri,
				BitmapDisplayConfig config, long total, long current) {
			super.onLoading(container, uri, config, total, current);
		}
	}
	// 加载图片的一个效果
	public static final ColorDrawable TRANSPARENT_DRAWABLE = new ColorDrawable(
			android.R.color.transparent);
	public void showDisplay(ImageView imageView, Bitmap bitmap) {
		final TransitionDrawable transitionDrawable = new TransitionDrawable(
				new Drawable[] { TRANSPARENT_DRAWABLE,
						new BitmapDrawable(imageView.getResources(), bitmap) });
		// 当图片出来之后，要把我的图片设置ImageView当中
		imageView.setImageDrawable(transitionDrawable);
		// 是一个事件产生需要一个时间
		transitionDrawable.startTransition(500);
	}
	public void display(ImageView imageView, String url) {
		// 外部的接口函数
		bitmapUtils.display(imageView, url, new MyBitmapLoadCallBack());

	}

}
