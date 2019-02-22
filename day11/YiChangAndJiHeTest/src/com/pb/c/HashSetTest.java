package com.pb.c;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<Person>();
		/*
		 * 添加到这个set集合中的对象有一个属性值相同
		 */
		Person p = new Person(21, "张三", "男");
		Person p1 = new Person(22, "张三", "女");
		Person p2 = new Person(33, "张三", "中性");

		set.add(p);
		set.add(p1);
		set.add(p2);
		System.out.println(set);

		// Iterator it = set.iterator();
		// while (it.hasNext()) {
		//
		// Object obj = it.next();
		// System.out.println(obj);
		//
		// }
		
		/*
		 * 往set集合中存储数据
		 * 可以重复可以不重复
		 * 主要看输出
		 */
		/*
		 * 存对象
		 * 对象可以是同一个可以不是同一个
		 * 看输出
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
