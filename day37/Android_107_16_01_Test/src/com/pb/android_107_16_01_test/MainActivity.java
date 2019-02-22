package com.pb.android_107_16_01_test;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	public Button button1;
	public EditText edit_Text;
	public WebView webView;
	// 网址
	public String str_1 = "http://www.weather.com.cn/weather/101010100.shtml";
	public final static String str_2 = "http://";
	// 进度条显示
	public ProgressDialog prod;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化
		button1 = (Button) findViewById(R.id.button1);
		edit_Text = (EditText) findViewById(R.id.editText1);
		webView = (WebView) findViewById(R.id.WebView_id);
		// 按钮的监听
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 隐藏软件盘
				((InputMethodManager) getSystemService(INPUT_METHOD_SERVICE))
						.hideSoftInputFromWindow(MainActivity.this
								.getCurrentFocus().getWindowToken(),
								InputMethodManager.HIDE_NOT_ALWAYS);
				// 加载页面
				webView.loadUrl(edit_Text.getText().toString());
				// 对加载的网页做监听，给用户做的
				webView.setWebViewClient(new WebViewClient() {
					@Override
					public boolean shouldOverrideUrlLoading(WebView view,
							String url) {
						// 当用户点击时，加载新的网页
						webView.loadUrl(url);
						// 新加载的网页地址，显示到edit_Text
						edit_Text.setText(url);
						return true;
					}
					// 进度条对话框的监听
					@Override
					public void onPageStarted(WebView view, String url,
							Bitmap favicon) {
						if (prod == null) {
							prod = ProgressDialog.show(MainActivity.this,
									"网页加载", "网页加载成功");
						} else {
							prod.show();
						}
						super.onPageStarted(view, url, favicon);
					}
					// 网页加载完成
					@Override
					public void onPageFinished(WebView view, String url) {
						if (prod != null) {
							// 加载完成的时候，隐藏进度条
							prod.hide();
						}
						super.onPageFinished(view, url);
					}
				});
				webView.setWebChromeClient(new WebChromeClient() {
					@Override
					public void onProgressChanged(WebView view, int newProgress) {
						MainActivity.this.setProgress(newProgress * 1000);
						super.onProgressChanged(view, newProgress);
					}
					@Override
					public void onReceivedTitle(WebView view, String title) {
						Log.d("---------------------------------", title);
						super.onReceivedTitle(view, title);
					}
				});
			}
		});
	}
}
