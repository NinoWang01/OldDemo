package com.pb.android_107_18_test;

import android.graphics.Bitmap;

import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;

//图片缓存的处理
public class MyBitmapCache implements ImageCache {
	// 声明
	public static MyBitmapCache imageCache = null;
	public static LruCache<String, Bitmap> lrucache = null;

	// 创建一个构造方法
	private MyBitmapCache() {
		// 得到一个变量,缓存空间的大小
		int cacheSize = (int) Runtime.getRuntime().maxMemory();// 获得内存剩余的最大值（最大空余空间）
		// 再从剩余空间中抽出1/8之一，作为图片的缓存
		int pageCache = cacheSize / 8;

		// 实例化lrucache
		lrucache = new LruCache<String, Bitmap>(pageCache) {
			@Override
			protected int sizeOf(String key, Bitmap value) {
				return value.getRowBytes() * value.getHeight();
			}
		};

	}

	// 图片是要通过这个实例来操作的
	public static MyBitmapCache getInstance() {
		if (imageCache == null) {
			imageCache = new MyBitmapCache();
		}
		return imageCache;

	}
	// 设置图片
	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		// 先判断图片为不为空
		if (getBitmap(url) == null) {
			lrucache.put(url, bitmap);
		}
	}
	// 返回图片大小
	@Override
	public Bitmap getBitmap(String url) {
		return lrucache.get(url);
	}

}
