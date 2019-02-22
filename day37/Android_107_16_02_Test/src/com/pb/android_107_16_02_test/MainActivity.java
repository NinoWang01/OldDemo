package com.pb.android_107_16_02_test;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends Activity implements OnClickListener {
	public ImageView image_view;
	public EditText editText;
	public Button button;
	// 设置两个常量，对应消息处理
	public final static int SUCCESS = 1;
	public final static int ERROR = 2;
	// 消息处理的主线程
	public Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case SUCCESS:
				// 先把msg携带的数据给转换了
				Bitmap bitmap = (Bitmap) msg.obj;
				// 给放到imageView 上
				image_view.setImageBitmap(bitmap);
				break;
			case ERROR:
				Toast.makeText(MainActivity.this, "请求失败了", Toast.LENGTH_LONG).show();
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

		// 图片
		image_view = (ImageView) findViewById(R.id.image_view_id);
		editText = (EditText) findViewById(R.id.edit_text_id);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 获取输入的地址
			final String str = editText.getText().toString().trim();
			// 做判断，判断地址为不为空
			if (TextUtils.isEmpty(str)) {
				// 为空就是地址不存在或者为空
				Toast.makeText(this, "地址为空，或不正确", Toast.LENGTH_LONG).show();

			} else {

				// 开启一个子线程
				new Thread() {
					// 做的逻辑操作，包括网络请求
					@Override
					public void run() {
						// 创建url对象
						try {
							URL url = new URL(str);
							// 获得HttpURLConnection的实例
							HttpURLConnection conn = (HttpURLConnection) url
									.openConnection();
							// 设置它的请求方式
							conn.setRequestMethod("GET");
							// 设置超时提示
							conn.setConnectTimeout(5000);
							// 判断请求服务器是否成功,调用这个getResponseCode方法得到返回状态码
							int code = conn.getResponseCode();
							if (code == 200) {
								// 先获取输入流
								InputStream is = conn.getInputStream();
								// 将输入流转换成图片对象
								Bitmap bitmap = BitmapFactory.decodeStream(is);
								// 处理完毕之后，给主线程发送一个消息，告诉主线程，你去更新UI界面
								// 消息对象
								Message msg = new Message();
								msg.what = SUCCESS;
								// 请求的服务器的数据
								msg.obj = bitmap;
								// 发送消息
								handler.sendMessage(msg);
							} else {
								Message msg = new Message();
								msg.what = ERROR;
								// 发送消息
								handler.sendMessage(msg);
							}
						} catch (Exception e) {
							// 请求异常的一个消息
							Message msg = new Message();
							msg.what = ERROR;
							// 发送消息
							handler.sendMessage(msg);

						}

					}
				}.start();
			}

			break;

		default:
			break;
		}

	}

}
