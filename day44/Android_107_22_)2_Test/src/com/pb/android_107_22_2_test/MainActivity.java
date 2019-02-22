package com.pb.android_107_22_2_test;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity implements OnClickListener {

	public VideoView video_view;
	public Button button1, button2, button3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		video_view = (VideoView) findViewById(R.id.video_view_id);
		button1 = (Button) findViewById(R.id.play_id);
		button1.setOnClickListener(this);
		button2 = (Button) findViewById(R.id.pause_id);
		button2.setOnClickListener(this);
		button3 = (Button) findViewById(R.id.replay_id);
		button3.setOnClickListener(this);
		// 视频播放的初始化准备
		initVideo();

	}

	public void initVideo() {
		// 本地视频
		File file = new File(Environment.getExternalStorageDirectory(),
				"《人性》一部获得了全世界102个奖项的短片.mp4");
		// 把file对应的本地文件给放到video_view中来
		video_view.setVideoPath(file.getPath());

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.play_id:
			// 开始播放视频
			video_view.start();
			break;
		case R.id.pause_id:
			if (video_view.isPlaying()) {
				video_view.pause();
			}

			break;
		case R.id.replay_id:
			if (video_view != null) {
				video_view.resume();// 重播前的工作
				video_view.start();
			}

			break;
		default:
			break;
		}

	}

	@Override
	protected void onDestroy() {
		if (video_view != null) {
			video_view.suspend();

		}
		super.onDestroy();
	}

}
