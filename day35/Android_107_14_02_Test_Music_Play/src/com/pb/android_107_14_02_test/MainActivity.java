package com.pb.android_107_14_02_test;

import java.io.File;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.pb.android_107_14_02_test.serciver.MyMusicService;
import com.pb.android_107_14_02_test.serciver.MyMusicService.MyBinder;

public class MainActivity extends Activity implements OnClickListener {

	public EditText edit_Text;
	public MyConn myConn;
	public MyBinder binder;
	public SeekBar mseekBar;

	public TextView text_view_2, text_view_3, text_view_4;
	public Button text_view_1;

	public Intent intent;
	public Thread myThread;

	// 主线程
	public Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {

			switch (msg.what) {
			case 100:
				// 把传过来的进度值转化成整型
				int a = (Integer) msg.obj;
				// 把改变的进度值设置到进度条当中去
				mseekBar.setProgress(a);

				break;

			default:
				break;
			}
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		edit_Text = (EditText) findViewById(R.id.et_inputpath);
		mseekBar = (SeekBar) findViewById(R.id.seekBar1);
		text_view_1 = (Button) findViewById(R.id.bt_play);
		text_view_2 = (TextView) findViewById(R.id.bt_pause);
		text_view_3 = (TextView) findViewById(R.id.bt_stop);
		text_view_4 = (TextView) findViewById(R.id.bt_replay);
		//
		text_view_1.setOnClickListener(this);
		text_view_2.setOnClickListener(this);
		text_view_3.setOnClickListener(this);
		text_view_4.setOnClickListener(this);

		// 判断服务和activity的链接实例
		myConn = new MyConn();
		// 启动服务
		intent = new Intent(this, MyMusicService.class);
		bindService(intent, myConn, BIND_AUTO_CREATE);

	}

	// 初始化进度条，同时获取文件的长度
	public void initSeekBar() {
		// 文件的长度
		int musicwidth = binder.getMusicWidths();
		// 把长度设置到进度条中去
		mseekBar.setMax(musicwidth);
	}

	// 开启一个子线程，（更新UI界面的变化后的效果,主线程中不做UI界面的更新操作或耗时操做）
	public void updateProgress() {
		// 创建一个子线程
		myThread = new Thread() {
			@Override
			public void run() {

				while (!interrupted()) {

					// 调用服务器中的方法，获取当前进度条的进度位置
					int currentPosition = binder.getCurrentPositions();

					// 打包成消息，发送给主线程
					Message message = Message.obtain();
					message.obj = currentPosition;
					message.what = 100;
					// 消息的发送
					handler.sendMessage(message);
				}

			}
		};
		// 启动子线程
		myThread.start();

	}

	@Override
	public void onClick(View v) {
		// 获得要播放歌曲的路径
		String path = edit_Text.getText().toString().trim();
		// 拿到歌曲在当前SD卡中的路径
		File SDpath = Environment.getExternalStorageDirectory();
		File file = new File(SDpath, path);
		// 组成新的路径，作为歌曲的播放路径
		String new_path = file.getAbsolutePath();

		switch (v.getId()) {
		// 播放
		case R.id.bt_play:

			// 判断
			if (file.exists() && file.length() > 0) {
				// 允许播放
				binder.plays(new_path);
				// 改变进度条进度的方法
				initSeekBar();
				// 更新进度条进度变的方法
				updateProgress();
			}

			break;

		// 暂停
		case R.id.bt_pause:
//			text_view_2.setBackgroundResource(android.R.drawable.ic_media_play);
			// 调用暂停的方法
			binder.pauses();

			break;
		// 停止
		case R.id.bt_stop:
			// 线终止子线程
			myThread.interrupt();
			// 判断线程停止的状态
			if (myThread.isInterrupted()) {
				// 停止播放
				binder.stops();

			}

			break;
		// 重播
		case R.id.bt_replay:
			binder.replays(new_path);

			break;

		default:
			break;
		}

	}

	public class MyConn implements ServiceConnection {

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			binder = (MyBinder) service;
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	protected void onDestroy() {
		// 如果线程没有退出，在这里退出
		if (myThread != null && !myThread.isInterrupted()) {
			myThread.interrupt();

		}
		// 退出服务
		unbindService(myConn);
		super.onDestroy();
	}

	// 重写一下activity的destory方法

}
