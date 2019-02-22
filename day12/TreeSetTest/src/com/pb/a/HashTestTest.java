package com.pb.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashTestTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, 1);
		map.put("2", "asfsdg");
		map.put("3", "as");
		map.put("4", "adg");
		/*
		 * HashMap遍历方式三
		 */
		// 父接口
		Collection vaule = map.values();
		// 获得迭代器对象
		Iterator it = vaule.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
	
	
	
	/*
	 * 存储的数据不少于5个，创建集合创建的HashMap
	 * 遍历的方式，两种方式（都写）
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
