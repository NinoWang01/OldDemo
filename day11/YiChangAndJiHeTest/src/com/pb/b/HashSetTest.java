package com.pb.b;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		
		HashSet set = new HashSet();
		Set s = new HashSet();

		set.add("12345");
		set.add("12345");
		set.add("12345");
		set.add("12345");
		set.add("12345");

		/*
		 * 添加5个元素，输出一个
		 */
		for (Object obj : set) {
			
			System.out.println(set);

		}

	}

}
