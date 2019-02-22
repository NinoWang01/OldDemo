package com.pb.a;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("2355");
		list.add('a');
		list.add(45);
		// 倒序遍历（）逆序遍历 对象,把集合的长度
		ListIterator it = list.listIterator(list.size());

		it.add("7890890");
		it.add("hjlhjkh");
		while (it.hasPrevious()) {
			//给集合新添加一个元素
//			list.add("456567658");
			
			// 遍历出一个集合元素
			Object obj = it.previous();
			System.out.println(obj);
		}

	}

}
