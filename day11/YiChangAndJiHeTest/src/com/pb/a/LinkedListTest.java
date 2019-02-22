package com.pb.a;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(13455);
		list.add("zgsdg");
		list.add('s');

		//正序遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);

		}

	}
}
