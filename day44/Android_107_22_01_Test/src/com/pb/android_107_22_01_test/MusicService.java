package com.pb.android_107_22_01_test;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
public class MusicService extends Service {
	// 获得一个
	public MediaPlayer mediaplayer;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	// 初始化
	@Override
	public void onCreate() {
		try {
			// 判断mediaplayer是否为空
			if (mediaplayer == null) {
				// 实例化mediaplayer对象
				mediaplayer = MediaPlayer.create(MusicService.this,
						Uri.parse("http://192.168.155.1:8080/music/furongyu.mp3"));
				mediaplayer.prepare();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.onCreate();
	}

	// 退出的时候的释放资源
	@Override
	public void onDestroy() {
		// 判断当前资源为不为空
		if (mediaplayer != null) {
			// 停止
			mediaplayer.stop();
			mediaplayer.release();
			// 意思说把mediaplayer当中音频文件清空
			mediaplayer = null;
		}
		super.onDestroy();
	}

	// 开启服务
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		// 现获得 bundle的对象
		Bundle bundle = intent.getExtras();
		// 通过bundle得到intent携带过来的参数
		int b = bundle.getInt("type");
		// 判断用户的操作
		switch (b) {
		// 播放
		case 1:
			// 播放方法
			play();
			break;
		// 暂停
		case 2:
			paus();
			break;
		// 停止
		case 3:
			stoop();
			break;
		}
		return super.onStartCommand(intent, flags, startId);
	}
	public void stoop() {
		// 判断
		if (mediaplayer != null) {
			// 设置成从头开始
			mediaplayer.seekTo(0);
			// 停止
			mediaplayer.stop();
		}
	}
	public void paus() {
		// 继续播放
		// int s=mediaplayer.getCurrentPosition();
		// mediaplayer.seekTo(s);//接着上次播放的位置进行播放
		if (mediaplayer.isPlaying()) {
			// 调用mediaplayer的暂停播放
			mediaplayer.pause();
		}
	}
	public void play() {
		// 判断当前的你要播放的音频文件
		if (mediaplayer != null && mediaplayer.isPlaying()) {
			// 调用mediaplayer的开始播放的方法
			mediaplayer.start();
		}

	}

}
