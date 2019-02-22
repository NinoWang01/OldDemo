package cn.pb.android_107_19_test;

import java.io.ByteArrayInputStream;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import bean.NewsInfo;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.image.SmartImageView;
import com.pb.android_107_19_test.R;

public class MainActivity extends Activity {

	// 创建集合和listview、以及LinearLayout

	public ListView list_view;
	public List<NewsInfo> list;
	public LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化控件
		list_view = (ListView) findViewById(R.id.lv_news);
		layout = (LinearLayout) findViewById(R.id.loading);
		// 创建一个初始化的方法
		initView();
//		layout.setVisibility(View.INVISIBLE);
	}

	// 初始化（初始化页面）的方法 10.0.7.60
	private void initView() {
		// 想创建AsyncHttpClient的实例
		AsyncHttpClient client = new AsyncHttpClient();
		// 设置请求方式
		client.get(MainActivity.this.getString(R.string.xmlUrl),
				new AsyncHttpResponseHandler() {

					@Override
					public void onSuccess(String content) {

						// 访问成功
						super.onSuccess(content);
						// 现将字符串转化成字节数组
						byte[] bytes = content.getBytes();
						// 再将字节数组转化输入流
						ByteArrayInputStream bais = new ByteArrayInputStream(
								bytes);
						// 调用写的解析XML 的工具类
						list = NewsInfoService.getNewsInfo(bais);
						// 判断集合是否为空
						if (list == null) {
							// 解析失败
							Toast.makeText(MainActivity.this, "解析失败，或者请求失败",
									Toast.LENGTH_LONG).show();
						} else {
							// 更新UI（手机界面）界面
							layout.setVisibility(View.INVISIBLE);// 请求到请求到位置
							// 在list添加到adapter中去
							list_view.setAdapter(new MyAdapter());

						}

					}

					@Override
					public void onFailure(Throwable error, String content) {
						super.onFailure(error, content);
						Toast.makeText(MainActivity.this, "请求失败",
								Toast.LENGTH_LONG).show();
					}
				});

	}

	// 适配器
	public class MyAdapter extends BaseAdapter {
		@Override
		public int getCount() {

			return list.size();
		}

		@Override
		public Object getItem(int position) {

			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// 新得到一个视图
			View view = View.inflate(MainActivity.this, R.layout.adapter_page,
					null);
			// 创建SmartImageView
			SmartImageView siv = (SmartImageView) view
					.findViewById(R.id.siv_icon);
			// 三个TextView
			TextView text_view_1 = (TextView) view.findViewById(R.id.tv_title);
			TextView text_view_2 = (TextView) view
					.findViewById(R.id.tv_content);
			TextView text_view_3 = (TextView) view
					.findViewById(R.id.tv_comment);
			// 得到一个实体类对象
			NewsInfo newsinfo = list.get(position);
			// 设置item的图标
			siv.setImageUrl(newsinfo.getIconPath(), R.drawable.ic_launcher,
					R.drawable.ic_launcher);
			// 设置新闻标题
			text_view_1.setText(newsinfo.getTitle());
			text_view_2.setText(newsinfo.getContent());

			// 通过新闻类型的变量，设置整条新闻不同颜色和不同内容
			int type = newsinfo.getType();
			switch (type) {
			// 科技类新闻
			case 1:
				text_view_3.setText(String.valueOf(newsinfo.getComment()));
				break;
			// 文学类
			case 2:
				text_view_3.setTextColor(Color.RED);
				text_view_3.setText("" + String.valueOf(newsinfo.getComment()));
				break;
			case 3:
				text_view_3.setTextColor(Color.BLUE);
				text_view_3.setText(String.valueOf(newsinfo.getComment()));
				break;
			default:
				break;
			}

			return view;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
