package com.pb.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		HashMap map2 = new HashMap();
		map.put(1, 1);
		map.put("2", "asfsdg");
		map.put("3", "as");
		map.put("4", "adg");
		// 把整个集合都作为字符串输出
		// System.out.println(map);
		// System.out.println(map.get("3"));
		// 先去获得键的集合
		Set keySet = map.keySet();
		// 在去获得迭代器对象
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			// 获得键
			Object key = it.next();
			// 获得键对应的值
			Object vaule = map.get(key);
			System.out.println(key + ":" + vaule + "\t");
		}
		/*
		 * 往里边放不同的键值对，进行遍历
		 */
	}
}
