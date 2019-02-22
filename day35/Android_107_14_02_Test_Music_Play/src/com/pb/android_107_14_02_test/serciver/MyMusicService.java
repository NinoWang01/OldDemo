package com.pb.android_107_14_02_test.serciver;

import java.io.IOException;
import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyMusicService extends Service {
	public MediaPlayer mediaPlayer;
	private static final String TAG = "MyMusicService";

	// 创建一个内部类，
	public class MyBinder extends Binder {
		// 播放
		public void plays(String path) {
			play(path);
		}

		// 暂停
		public void pauses() {
			pause();
		}

		// 停止
		public void stops() {
			stop();
		}

		// 重播
		public void replays(String path) {
			replay(path);
		}

		// 获取当前音乐播放的进度
		public int getCurrentPositions() {
			return getCurrentPosition();
		}

		// 获取资源文件总的长度
		public int getMusicWidths() {
			return getMusicWidth();
		}
	}

	// 播放音乐
	public void play(String path) {
		try {
			if (mediaPlayer == null) {
				// 开始播放
				Log.i(TAG, "开始播放音乐");
				// 如果为空，需要重新创建一个实例
				mediaPlayer = new MediaPlayer();
				// 指定的是当前播放的为音频文件
				mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);// AudioManager中的常量值
				// 指定播放路径，即设置播放前的状态
				mediaPlayer.setDataSource(path);
				// 准备播放
				mediaPlayer.prepare();
				mediaPlayer.setOnPreparedListener(new OnPreparedListener() {
					@Override
					public void onPrepared(MediaPlayer mp) {
						// 开始播放
						mediaPlayer.start();
					}
				});

			} else {
				// 针对的是第二次点击，查看当前音乐播放的进度到哪里了
				int position = getCurrentPosition();
				// 把当前的进度设置进进度条中
				mediaPlayer.seekTo(position);
				// 准备播放的方法
				mediaPlayer.prepare();
				mediaPlayer.start();
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	// 暂停
	public void pause() {
		if (mediaPlayer != null && mediaPlayer.isPlaying()) {
			// 暂停播放
			Log.i(TAG, "开始暂停音乐");
			mediaPlayer.pause();// 音乐暂停
		} else if (mediaPlayer != null && (!mediaPlayer.isPlaying())) {
			try {
				mediaPlayer.prepare();
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			mediaPlayer.start();
		}
	}
	// 停止
	public void stop() {
		if (mediaPlayer != null && mediaPlayer.isPlaying()) {
			Log.i(TAG, "停止音乐");
			mediaPlayer.stop();
			// 释放资源
			mediaPlayer.release();
			mediaPlayer = null;// 当下次播放新的音乐的时候，
		} else {
			Toast.makeText(getApplicationContext(), "已停止，如果播放，就要从最初开始播放",
					Toast.LENGTH_LONG).show();
		}
	}
	// 重播
	public void replay(String path) {
		if (mediaPlayer != null) {
			Log.i(TAG, "重新播放音乐");
			mediaPlayer.seekTo(0);
			try {
				mediaPlayer.prepare();
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			mediaPlayer.start();
		}
	}

	// 当前进度
	public int getCurrentPosition() {

		if (mediaPlayer != null && mediaPlayer.isPlaying()) {
			return mediaPlayer.getCurrentPosition();
		} else if (mediaPlayer != null && (!mediaPlayer.isPlaying())) {
			return mediaPlayer.getCurrentPosition();
		}
		return 0;
	}

	// 获得资源文件总的长度
	private int getMusicWidth() {
		if (mediaPlayer != null) {
			// 返回资源文件的一个方法
			return mediaPlayer.getDuration();
		}
		return 0;
	}

	// 服务已经退出程序
	@Override
	public void onDestroy() {
		if (mediaPlayer != null) {
			mediaPlayer.stop();
			mediaPlayer.release();
			mediaPlayer = null;
		}
		super.onDestroy();
	}

	@Override
	public IBinder onBind(Intent intent) {

		return new MyBinder();

	}

}
