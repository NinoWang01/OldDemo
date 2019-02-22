package com.pb.android_107_27_02_test;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;

import com.baidu.mapapi.map.MapView;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends Activity {

	// 创建一个MapView
	public MapView mMapView;
	// 定位的一个对象
	public LocationClient locationClient;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 在使用SDK各组件之前初始化context信息，传入ApplicationContext
		// 注意该方法要再setContentView方法之前实现
		SDKInitializer.initialize(getApplicationContext());

		setContentView(R.layout.activity_main);
		// 地图展示的控件
		mMapView = (MapView) findViewById(R.id.bmapView);
		// 实例化
		locationClient = new LocationClient(getApplicationContext());

		// 获取过滤信息的对象
		LocationClientOption option = new LocationClientOption();
		// 设置一些请求,超时
		option.setTimeOut(5000);
		// 是否打开GPS
		option.setOpenGps(true);
		// 请求的一个间隔时间
		option.setScanSpan(10000);
		// 是否需要设备的方向
		option.setNeedDeviceDirect(false);
		// 设置坐标类型
		option.setCoorType("bd09ll");
		// 是否需要地址
		option.setIsNeedAddress(false);
		// 位置的精度
		/*
		 * Hight_Accuracy:指的是网络定位和GPS定位当中，哪一个精度高，我要哪一个 Battery_Saving:网络定位
		 * Device_Sensors:GPS定位
		 */
		option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
		// 信息的返回样式
		locationClient.setLocOption(option);

		// 这侧一个监听，监听服务的开启
		locationClient.registerLocationListener(listener);
		// 开启服务定位
		locationClient.start();
		// 请求服务定位的信息
		locationClient.requestLocation();

	}

	public BDLocationListener listener = new BDLocationListener() {

		// bdLocation:你去请求百度定位时，返回的所有位置信息
		@Override
		public void onReceiveLocation(BDLocation bdLocation) {
			// bdLocation

			// 经度
			double a = bdLocation.getLongitude();
			// 纬度
			double b = bdLocation.getLatitude();
			Log.d("======================================", a + "左边是经度，右边是纬度"
					+ b);

			// 地址
			bdLocation.getAddress();
			// 街道
			bdLocation.getStreet();
			// 街道号
			bdLocation.getStreetNumber();
			// 城市
			bdLocation.getCity();
			// 省份
			bdLocation.getProvince();
			// 国家
			bdLocation.getCountry();
			// 楼层
			bdLocation.getFloor();
			// 位置信息,信息类型
			bdLocation.getLocType();
			// 速度
			bdLocation.getSpeed();
			// 方向
			bdLocation.getDirection();
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
		mMapView.onDestroy();
	}

	@Override
	protected void onResume() {
		super.onResume();
		// 在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
		mMapView.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		// 在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
		mMapView.onPause();
	}
}
