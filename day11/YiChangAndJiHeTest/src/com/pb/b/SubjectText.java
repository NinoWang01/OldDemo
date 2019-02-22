package com.pb.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubjectText {

	public static void main(String[] args) {

		/*
		 * List<Subject> list = new ArrayList<Subject>();
		 * 当你这样声明创建集合
		 * 
		 *集合已经被限制了（存储数据的类型）
		 * 
		 * 
		 */
		List<Subject> list = new ArrayList<Subject>();

		Subject s1 = new Subject(1, 2, 3,  11);
		Subject s2 = new Subject(4, 5, 6, 7);
		Subject s3 = new Subject(8, 9, 10,4);
		Subject s4 = new Subject(12, 13, 14, 5);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		 
		// 去比较php
		Collections.sort(list, new comparatorSubject());

		// 遍历集合
		for (Object obj : list) {
			System.out.println(obj);

		}

	}

	// Comparator sss=new comparatorSubject();
	// 静态的内部类
	static class comparatorSubject implements Comparator<Subject> {

		@Override
		public int compare(Subject s1, Subject s2) {
			return s1.getPhp() - s2.getPhp();
		}

	}

}
