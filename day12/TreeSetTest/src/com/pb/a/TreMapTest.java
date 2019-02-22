package com.pb.a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreMapTest {
	public static void main(String[] args) {

		TreeMap map = new TreeMap(new ComparatorWith());
		// 学生
		map.put("jack", "3");
		map.put("tom", "2");
		map.put("jone", "1");
		map.put("ros", "4");
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
	// 比较器,比较的是键的大小,比较器是这样来用的
	static class ComparatorWith implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
			// 转换成String
			String s1 = (String) o1;
			String s2 = (String) o2;
			int a = s1.compareTo(s2);
			return a;
		}

	}

}
