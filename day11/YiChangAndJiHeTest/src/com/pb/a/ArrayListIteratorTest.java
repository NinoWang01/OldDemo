package com.pb.a;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// 获取迭代(遍历)器对象
		Iterator it = list.iterator();
		// 循环迭代(遍历)
		while (it.hasNext()) {
			// 迭代(遍历)出元素
			Object obj = it.next();
			System.out.println(obj);
		}
		// 增强for循环
		for (Object obj : list) {
			System.out.println(obj);

		}

	}

}
