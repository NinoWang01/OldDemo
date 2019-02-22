package com.com.android_107_20_test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.db.sqlite.Selector;
import com.lidroid.xutils.exception.DbException;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.HttpHandler;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;
import com.lidroid.xutils.util.LogUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends Activity {

	// 都用注解的方式指向控件
	@ViewInject(R.id.button1)
	public Button button1;
	@ViewInject(R.id.button2)
	public Button button2;
	@ViewInject(R.id.button3)
	public Button button3;
	@ViewInject(R.id.button4)
	public Button button4;
	@ViewInject(R.id.button5)
	public Button button5;
	@ViewInject(R.id.iamgeview)
	public ImageView imageView;

	// public ProgressDialog pro;
	// xUtils提供了handler
	public HttpHandler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 注入到当前的activity
		ViewUtils.inject(this);

	}

	// 加载图片
	@OnClick(R.id.button3)
	public void pageClick(View v) {
		//
		xUtilsImageLoading sil = new xUtilsImageLoading(this);
		String url = "http://e.hiphotos.baidu.com/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50%3Bt%3Dgif/sign=9751cc36fbdcd100d991f07313e22c75/8326cffc1e178a821597199bf503738da977e866.jpg";
		// 请求加载的图片放在imageView中，
		sil.display(imageView, url);
	}

	// 数据库的创建
	@OnClick(R.id.button4)
	public void create(View v) throws DbException {
		// 获得DBUtils实例
		DbUtils db = DbUtils.create(this);
		// 实体类对象
		User user1 = new User();
		user1.setName("张三");
		user1.setAge(20);

		User user2 = new User();
		user2.setName("李四");
		user2.setAge(22);

		User user3 = new User();
		user3.setName("jack");
		user3.setAge(23);

		User user4 = new User();
		user4.setName("tom");
		user4.setAge(24);
		// 先把对象添加到集合当中去
		List<User> list = new ArrayList<User>();
		// 四个对象添加进入集合
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		// 根据User实体类，创建数据库表结构，然后把数据插入进去
		db.saveBindingIdAll(list);
	}

	// 查询数据库中的数据
	@OnClick(R.id.button5)
	public void findDb(View v) throws DbException {
		// 获得DBUtils实例
		DbUtils db = DbUtils.create(this);
		// 根据User实体类查找所有的数据
		List<User> list = db.findAll(User.class);
		// 循环遍历
		for (User user : list) {
			LogUtils.d("姓名：" + user.getName() + "年龄：" + user.getAge()
					+ user.getId());
		}

		// 查找第一个数据
		User user2 = db.findFirst(User.class);
		LogUtils.d("姓名：" + user2.getName() + "年龄：" + user2.getAge()
				+ user2.getId());
		// 根据ID查找数据
		User user3 = db.findById(User.class, 3);// 第四条
		LogUtils.d("姓名：" + user3.getName() + "年龄：" + user3.getAge()
				+ user3.getId());
		// 根据年龄查询
		List<User> list2 = db.findAll(Selector.from(User.class).where("age",
				"=", 23));
		for (User user0 : list2) {
			LogUtils.d("姓名：" + user0.getName() + "年龄：" + user0.getAge()
					+ user0.getId());
		}

	}

	// 下载
	@OnClick(R.id.button2)
	public void downLoad(View v) {

		final ProgressDialog pro = new ProgressDialog(this);
		// 下载文件的实例
		HttpUtils httpUtils = new HttpUtils();
		String url = "http://123.125.86.38/down.myapp.com/myapp/qqteam/AndroidQQ/mobileqq_android.apk?mkey=5462905c101807d1&f=d410&p=.apk";
		handler = httpUtils.download(url, "/sdcard/xUtils", true, true,
				new RequestCallBack<File>() {
					@Override
					public void onLoading(long total, long current,
							boolean isUploading) {
						super.onLoading(total, current, isUploading);
						// 文件的总共大小
						LogUtils.d("下载中" + total);
						int zongde = (int) current;
						LogUtils.d("已经下载的文件大小" + current);

						int loadSize = (int) total;
						// 进度条显示的变化
						pro.setProgress((int) (((double) current / (double)total) * 100));
					}

					@Override
					public void onStart() {
						// 提示
						LogUtils.d("开始下载");
						// 设置下文件时的进度条
						// 设置标题
						pro.setTitle("正在下载文件。。。。。。");
						// 对话框进度条显示的样式
						pro.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
						// 进度条变化了100，那么我就给进度条设置进去，给边当前的进度条显示
						pro.setProgress(100);
						// 开始下载
						pro.setMessage("开始下载。。。");
						pro.setButton("取消下载",
								new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// 点击取消按钮的时候
										LogUtils.d("取消下载");
										dialog.cancel();
										handler.cancel();
									}
								});
						pro.show();
					}

					@Override
					public void onFailure(HttpException arg0, String arg1) {
						LogUtils.d("下载失败");
					}

					@Override
					public void onSuccess(ResponseInfo<File> arg0) {
						LogUtils.d("下载成功");
						pro.dismiss();
					}
				});
	}

	// 上传
	@OnClick(R.id.button1)
	public void send(View v) {
		// 上传一个文件到服务器
		// 现获得HttpUtils的实例
		HttpUtils http = new HttpUtils();
		// 设置请求的超时时间
		http.configCurrentHttpCacheExpiry(10000);
		// 请求方式加上请求地址 上传服务器位置的地址
		http.send(HttpMethod.GET, "", new RequestCallBack<String>() {
			@Override
			public void onLoading(long total, long current, boolean isUploading) {
				if (isUploading) {
					LogUtils.d("上传开始");

				} else {
					LogUtils.d("上传结束");
				}
			}

			@Override
			public void onFailure(HttpException arg0, String arg1) {
				LogUtils.d("上传失败" + arg1);
			}

			@Override
			public void onSuccess(ResponseInfo<String> arg0) {
				LogUtils.d("上传成功" + arg0.result);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
