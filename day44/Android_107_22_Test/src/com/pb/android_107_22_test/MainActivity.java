package com.pb.android_107_22_test;

import java.io.File;
import java.io.IOException;

import android.media.AudioManager;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener {
	// 播放音频文件对象
	public MediaPlayer mediaplayer;
	public Button button1, button2, button3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mediaplayer = new MediaPlayer();
		button1 = (Button) findViewById(R.id.button_id_1);
		button2 = (Button) findViewById(R.id.button_id_2);
		button3 = (Button) findViewById(R.id.button_id_3);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		// 指向要播放的音频文件

		init();

	}

	// 准备播放的各个事件
	private void init() {
		try {
			// 要播放的文件
			File file = new File(Environment.getExternalStorageDirectory(),
					"芙蓉雨.mp3");
			// 设置要播放音频的
			mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			// 让mediaplayer指到要播放的音频文件
			mediaplayer.setDataSource(file.getPath());
			// 播放音频文件之前的准备方法的调用
			mediaplayer.prepare();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// 播放
		case R.id.button_id_1:

			// 开始播放
			mediaplayer.start();

			break;
		// 暂停
		case R.id.button_id_2:

			mediaplayer.pause();
			break;
		// 重播
		case R.id.button_id_3:
			// 重播的话，重新准备
			mediaplayer.reset();// 重新设置数据源的
			init();
			mediaplayer.start();

			break;

		default:
			break;
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mediaplayer != null) {
			// 释放资源
			mediaplayer.stop();
			mediaplayer.release();
		}

	}

}
