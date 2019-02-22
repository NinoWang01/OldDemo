package com.pb.android_107_5_02_test;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class MainActivity extends Activity {
	private Spinner spinner_1, spinner_2;
	// 数组
	private String[] str_a = new String[] { "北京市", "上海市", "深圳市", "香港市" };
	private String[][] str_b = new String[][] {
			{ "海淀", "西城", "东城", "朝阳", "石景山" }, { "闵行", "嘉定", "浦东", "宝山" },
			{ "竹子林", "车公展", "皇岗", "香蜜湖", "下沙" }, { "大谭", "湾仔峡", "渣甸山", "扫杆埔" } };
	// 适配器
	private ArrayAdapter<String> adapter_1 = null;
	private ArrayAdapter<String> adapter_2 = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 实例化两个spinner
		spinner_1 = (Spinner) findViewById(R.id.one_id);
		spinner_2 = (Spinner) findViewById(R.id.two_id);
		// 实例化adapter
		adapter_1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, str_a);
		// 把adapter放到spinner中去
		spinner_1.setAdapter(adapter_1);
		adapter_2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1);
		// 把adapter放到spinner中去
		spinner_2.setAdapter(adapter_2);
		// 监听
		spinner_1.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// 当点击第一个spinner的时候
				// 先把adapter_2清空一下
				adapter_2.clear();
				adapter_2.addAll(str_b[position]);
			}
			@Override
			public void onNothingSelected(AdapterView<?> parent) { 
			}
		});
	}
}
