package com.pb.android_107_18_test;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AbsListView.LayoutParams; 
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.Volley;

public class MainActivity extends Activity {
	// 添加一个标记的常量
	public final static String TAG = "MainActivity";

	// 创建一个GridView
	public GridView grid_view;
	// 创建请求队列
	public RequestQueue mRequestQueue;
	// 请求对象
	public String[] imgPageUrls = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 数组赋值
		imgPageUrls = ImageViewUrl.imageUrls;
		// 初始化
		initView();

	}

	// 初始化页面
	private void initView() {
		// 得到请求队列
		mRequestQueue = Volley.newRequestQueue(this);
		// 实例化grid_view
		grid_view = (GridView) findViewById(R.id.grid_view_id);

		// 创建一个adapter
		MyAdapter adapter = new MyAdapter(this, imgPageUrls,
				mRequestQueue);
		// 把适配器放到grid_view中去
		grid_view.setAdapter(adapter);

		// 先写grid_view的监听
		grid_view.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 页面的跳转
				Intent intent = new Intent(MainActivity.this,
						BitmapshowActivity.class);
				// 创建bundle
				Bundle bundle = new Bundle();
				bundle.putInt("position", position);
				intent.putExtras(bundle);
				startActivity(intent);

			}
		});

	}

	// 创建适配器
	public class MyAdapter extends BaseAdapter {
		public Context context;
		public ImageLoader imageLoader;
		public String[] imgAdapterUrls = null;// 本地化的

		// 适配器的构造方法

		public MyAdapter(Context context, String[] str, RequestQueue queue) {
			this.context = context;
			this.imgAdapterUrls = str;
			// 实例化imageLoader
			imageLoader = new ImageLoader(queue, MyBitmapCache.getInstance());

		}

		@Override
		public int getCount() {
			return imgPageUrls.length;
		}

		@Override
		public Object getItem(int position) {
			return imgPageUrls[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) {
				imageView = new ImageView(context);
				LayoutParams params = new LayoutParams(100, 100, Gravity.CENTER);// 设置的是视图的大小
				// 设置图片
				imageView.setLayoutParams(params);
				imageView.setAdjustViewBounds(true);
				// 设置的是图片的大小
				imageView.setMaxWidth(90);
				imageView.setMaxHeight(90);
				// 给图片加一个padding
				imageView.setPadding(5, 5, 5, 5);
				// 给图片添加一个背景
				imageView.setBackgroundResource(R.drawable.magazine_bg);
				convertView=imageView;//这句漏掉了
			} else {
				imageView = (ImageView) convertView;
			}
			// 使用Volley
			ImageListener mimageListter = ImageLoader.getImageListener(
					imageView, R.drawable.nopic, R.drawable.defaultcovers);
			// 把请求到的图片一一放到imageView
			imageLoader.get(imgAdapterUrls[position], mimageListter, 90, 90);

			return convertView;
		}

	}

}
