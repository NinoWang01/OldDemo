package com.pb.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, 1);
		map.put("2", "asfsdg");
		map.put("3", "as");
		map.put("4", "adg");
		/*
		 * HashMap遍历方式二
		 */
		Set entrySet = map.entrySet();
		// 获得你迭代器的对象
		Iterator it = entrySet.iterator();
		// 循环输出
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			// 去获得map集合中的键
			Object key = entry.getKey();
			Object vaule = entry.getValue();
			System.out.println(key + ":" + vaule);

		}

	}
}
