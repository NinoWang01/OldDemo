package com.pb.android_107_7_02_test.tools;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/*
 * 使用SharedPreferences来存取数据
 */
public class Utils {
	// 存的方法
	public static boolean saveData(Context context, String name, String password) {
		// 获得SharedPreferences的实例
		SharedPreferences ps = context.getSharedPreferences("data",
				Context.MODE_PRIVATE);
		// 获取对内容操作的接口对象
		Editor et = ps.edit();
		// 存用户名
		et.putString("name", name);
		// 存密码
		et.putString("password", password);
		// 提交
		et.commit();
		return true;
	}

	// 当再次登陆的时候，我要从文件中取用户名和密码
	public static Map<String, String> getData(Context context) { 
		// 实例化集合
		Map<String, String> map = new HashMap<String, String>();
		// 获得SharedPreferences的实例
		SharedPreferences ps1 = context.getSharedPreferences("data",
				Context.MODE_PRIVATE);
		// 取的是用户名
		String name = ps1.getString("name", null);
		// 取密码
		String password = ps1.getString("password", null);
		// 取到到的值放到集合中去
		map.put("na", name);
		map.put("pa", password);
		return map;
	}
}
