package com.pb.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
	public static void main(String[] args) {
		// 类类型的数据对象
		ArrayList<Person> list1 = new ArrayList<Person>();
		Person p1 = new Person(20, "257934", "fgd");
		Person p2 = new Person(18, "231114", "sdjghgd");
		Person p3 = new Person(25, "23564", "sgd");
		Person p4 = new Person(55, "2334", "s");
		Person p5 = new Person(5, "2", "sd");
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		// 通过比较age
		Collections.sort(list1, new comparatorElement());//自然排序
		for (Object obj : list1) {
			System.out.println(obj);
		}
	}
	static class comparatorElement implements Comparator<Person> {
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getAge() - p2.getAge();
		}
	}
	/*
	 * 一个类：封装类
	 * 四个属性：
	 * Java     int 
	 * Android
	 * oracle
	 * PHP
	 * 测试类一个，通过创建对象，也要创建一个集合，把对象放入集合中
	 * 通过比较不同的对象的不同的科目的成绩
	 * 来对集合进行排序
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
