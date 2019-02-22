package com.pb.android_107_23_03_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	public VideoView video_view;
	public Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		video_view = (VideoView) findViewById(R.id.vedio_view_id);
		button1 = (Button) findViewById(R.id.Button1);
		// 得到网络视频路径http://fs.mv.web.kugou.com/201609262007/335f9388849cdcfad35a6a9406765b88/G055/M05/05/10/dw0DAFah0UiAJXcHAqnSlVWqvNg118.mp4
		video_view
				.setVideoPath("http://fs.mv.web.kugou.com/201609262007/335f9388849cdcfad35a6a9406765b88/G055/M05/05/10/dw0DAFah0UiAJXcHAqnSlVWqvNg118.mp4");
		// 要video_view天加一个控制器
		video_view.setMediaController(new MediaController(this));

		button1.setOnClickListener(listener);
		// 获得当前的播放时间点
//		video_view.getCurrentPosition();
//		// 获得视频的总的时长
//		video_view.getDuration();
	}

	public OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			// 开始播放
			video_view.start();

		}
	};

}
