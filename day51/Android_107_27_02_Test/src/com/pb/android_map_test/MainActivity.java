package com.pb.android_map_test;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {
	MapView mMapView = null;
	// 地图定位
	public LocationClient locationClient;
	// 定位
	public BaiduMap bmap;
	// 布尔类型的变量
	public boolean isLocation = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 在使用SDK各组件之前初始化context信息，传入ApplicationContext
		// 注意该方法要再setContentView方法之前实现
		SDKInitializer.initialize(getApplicationContext());
		setContentView(R.layout.activity_main);
		// 获取地图控件引用
		mMapView = (MapView) findViewById(R.id.bmapView);
		// 定位示例
		locationClient = new LocationClient(this);
		// 获取bmap
		bmap = mMapView.getMap();

		// 过滤数据
		LocationClientOption option = new LocationClientOption();
		// 超时
		option.setTimeOut(5000);
		// 是否打开GPS
		option.setOpenGps(true);
		// 地址请求时间的间隔，请求一次返回一次位置信息，否则呢，每个XXX秒返回一次
		option.setScanSpan(10000);
		// 是否需要设备方向
		option.setNeedDeviceDirect(false);
		// 坐标类型
		option.setCoorType("bd09ll");
		// 是否需要地址
		option.setIsNeedAddress(false);
		// 位置精度
		/*
		 * Battery_Saving：以网络进行定位 Device_Sensors：以GPS进行定位
		 * Hight_Accuracy:同时以GPS和网络进行定位，哪一个精度高，就返回哪一个位置信息
		 */
		option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
		// 过滤请求时不返回某些信息
		locationClient.setLocOption(option);

		// 注册一个位置监听事件
		locationClient.registerLocationListener(listener);

		// 开始服务
		locationClient.start();
		// 请求位置信息
		locationClient.requestLocation();

		// 设置可以查看我的位置信息
		bmap.setMyLocationEnabled(true);

	}

	public BDLocationListener listener = new BDLocationListener() {
		@Override
		public void onReceiveLocation(BDLocation bdLocation) {
			// 作为百度定位的一个整型值的返回
			int type = bdLocation.getLocType();

			Log.d("------------------------------------>", "" + type);
			// 判断
			if (type == 61 || type == 161) {
				// 经度
				double a = bdLocation.getLongitude();
				// 维度
				double b = bdLocation.getLatitude();

				Log.d("====================", a + "左边经度，右边维度" + b);

				// 处理位置信息的类,设置经纬度的范围
				MyLocationData locationData = new MyLocationData.Builder()
						.latitude(b).accuracy(bdLocation.getRadius())
						.longitude(a).build();
				bmap.setMyLocationData(locationData);

				// 第一次定位
				if (isLocation) {
					
					isLocation = false;
					// 获取经纬度对象
					LatLng latlng = new LatLng(a, b);
					float ss = bdLocation.getSatelliteNumber();// 19.0
					// 更新地图
					MapStatusUpdate update = MapStatusUpdateFactory
							.newLatLngZoom(latlng, ss);
					// 设置动画，让当前的定位移动屏幕中间来
					bmap.animateMapStatus(update);
					
					
				}

			}

			// // 地址
			// bdLocation.getAddress();
			// // 城市
			// bdLocation.getCity();
			// // 街道
			// bdLocation.getStreet();
			// // 街道号
			// bdLocation.getStreetNumber();
			// // 国家
			// bdLocation.getCountry();
			// // 楼层
			// bdLocation.getFloor();
			// // 位置信息类型
			// bdLocation.getLocType();
			// // 移动速度
			// bdLocation.getSpeed();
			// // 省
			// bdLocation.getProvince();
			// // 方向
			// bdLocation.getDirection();
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		// 在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
		mMapView.onDestroy();

		if (locationClient != null && locationClient.isStarted()) {
			// 地图定位给停止掉
			locationClient.stop();
		}

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
