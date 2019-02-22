package com.pb.android_107_27_test;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	// 输入框
	public EditText et_phone;
	// 按钮
	public Button button;
	// AppKey
	public static String AppKey = "17dad35813149";
	// AppSecret
	public static String AppSecret = "c02027b89db9b8f39304feb5b0ac9f32";
	//
	public Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 输入手机号的
		et_phone = (EditText) findViewById(R.id.et_write_phone);
		// 按钮
		button = (Button) findViewById(R.id.get_button_id);
		button.setOnClickListener(this);
		// 调用获取短信验证码的初始化方法
		SMSSDK.initSDK(this, AppKey, AppSecret);
		// 回调监听，通过它把验证码发送给我自己的程序
		EventHandler eh = new EventHandler() {
			@Override
			public void afterEvent(int event, int result, Object data) {
				// 如果把短信验证发送给自己的APP
//				Message msg = new Message();
//				msg.arg1 = event;
//				msg.what = result;
//				msg.obj = data;
//				// 消息的发送
//				handler.sendMessage(msg);
			}
		};
		SMSSDK.registerEventHandler(eh); // 注册短信回调
	}
	// 时间类的对象和线程
	public Timer timer = new Timer();
	// 时间任务
	public TimerTask timerTask;
	// 短信获取的线程需要的时间60秒
	public static int i = 60;
	public String phone;
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.get_button_id:
			// 先获得手机号
			phone = et_phone.getText().toString().trim();
			// 判断手机号为不为空
			if (!TextUtils.isEmpty(phone)) {
				if (isMobilePhone(phone)) {
					// mob提供的一个方法,判断你的你的手机号是位于哪个地区的
					SMSSDK.getVerificationCode("86", phone);
					// 当我点击按钮之后，让按钮失去焦点(不能再点击了)
					button.setEnabled(false);
					// 开启时间线程类
					timer.purge();
					timerTask = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									i--;
									// 先把按钮上文字给去掉
									button.setText(i + " ");
									// 判断时间i
									if (i < 0) {
										// 先把时间任务结束
										timerTask.cancel();
										button.setEnabled(true);
										button.setText("获取验证码");
										// 给时间重新赋值
										i = 60;
									}
								}
							});
						}
					};
					// 每隔一秒就去请求一次，这个方法是，以毫秒为单位的时间之间的后续执行。
					timer.schedule(timerTask, 0, 1000);
				}

			} else {
				Toast.makeText(MainActivity.this, "电话号码不能为空", Toast.LENGTH_LONG)
						.show();
			}
			break;
		default:
			break;
		}
	}
	/*
	 * 判断手机号的方法
	 */
	public boolean isMobilePhone(String mobile) {
		Pattern p = Pattern
				.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		Matcher match = p.matcher(mobile);
		boolean mobileboolean = match.matches();
		return mobileboolean;
	}
}
