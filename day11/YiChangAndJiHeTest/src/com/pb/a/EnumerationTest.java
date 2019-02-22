package com.pb.a;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	/*
	 * JDk1.2之前用Enumeration Iterator（这个借口出现之后，Enumeration就不怎么用了）
	 */
	public static void main(String[] args) {

		// ArrayList list = new ArrayList();
		/*
		 * 数据存储
		 */
		Vector list = new Vector();

		list.add(1);
		list.add("2355");
		list.add('a');
		list.add(45);

		// 迭代器对象
		Enumeration en = list.elements();
		// hasMoreElements()返回同样是布尔类型
		while (en.hasMoreElements()) {

			Object obj = en.nextElement();

			System.out.println(obj);

		}

	}

}
