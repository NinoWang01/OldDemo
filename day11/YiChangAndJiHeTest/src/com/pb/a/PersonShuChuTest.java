package com.pb.a;

import java.util.ArrayList;

public class PersonShuChuTest {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();

		Person p = new Person();
		p.age = 20;
		p.name = "张三丰";
		p.sexx = "男";
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "周芷若";
		p1.sexx = "女";
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "赵敏";
		p2.sexx = "女";
		// 给集合添加元素
		list.add(p);
		list.add(p1);
		list.add(p2);

		// System.out.println("姓名：" + list.get(0) + "年龄：" + list.get(1) + "性别："
		// + list.get(2) + "学号:" + list.get(3));
		System.out.println("姓名：" + list.get(0).getName() + "年龄："
				+ list.get(0).getAge() + "性别：" + list.get(0).getSexx());
		System.out.println("姓名：" + list.get(1).getName() + "年龄："
				+ list.get(1).getAge() + "性别：" + list.get(1).getSexx());
		System.out.println("姓名：" + list.get(2).getName() + "年龄："
				+ list.get(2).getAge() + "性别：" + list.get(2).getSexx());
	}
}
