package com.pb.android_107_16_test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	public WebView webView;
	public String StringUrl="http://www.weather.com.cn/weather/101010100.shtml";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化webView
		webView = (WebView) findViewById(R.id.web_view_id);
		//
		webView.getSettings().setJavaScriptEnabled(true);
		// 做一个点击事件
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				//根据传入URL再去加载新的网页
				webView.loadUrl(url);
				return true;
			}
		});
		//把网页加载到手机上
		webView.loadUrl(StringUrl);
	}
}
