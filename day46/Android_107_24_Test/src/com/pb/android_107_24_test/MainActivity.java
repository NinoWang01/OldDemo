package com.pb.android_107_24_test;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button button;
	public MyListener listener;
	public int a;
	public SensorManager sm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			// 传感器的管理器的实例
			sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
			// 获得一个具体的传感器示例
			List<Sensor> sensorList = sm.getSensorList(Sensor.TYPE_ALL);

			Sensor sensor = sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
			int a = 1;
			// 遍历
			for (Sensor s : sensorList) {

				Log.d("sensor" + a, "传感器的名称：" + s.getName());
				a++;

			}
			// 注册监听
			sm.registerListener(listener, sensor, a);

			break;

		default:
			break;
		}
	}

	public class MyListener implements SensorEventListener {

		@Override
		public void onSensorChanged(SensorEvent event) {
			// 数据可以通过event

		}

		@Override
		public void onAccuracyChanged(Sensor sensor, int accuracy) {
			// TODO Auto-generated method stub

		}

	}

	//注销传感器
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		sm.unregisterListener(listener);
		listener=null;

	}

}
