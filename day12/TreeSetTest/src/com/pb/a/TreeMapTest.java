package com.pb.a;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		/*
		 * 实例化对象，往map就和中赋值
		 */
		TreeMap map = new TreeMap();
		map.put("3", "123");
		map.put("5", "456");
		map.put("1", "789");
		map.put("4", "12345");
		map.put("2", "67890");
		// 获得键的集合
		Set keySet = map.keySet();
		// 获取迭代器
		Iterator it = keySet.iterator();
		// 循环遍历输出
		while (it.hasNext()) {
			// 键
			Object key = it.next();
			// 键的值
			Object value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
	/*
	 * 往TreeMap添加元素，不少5个
	 * 采用迭代的方式遍历输出
	 */
	
	
	
	
	
	
	

}
