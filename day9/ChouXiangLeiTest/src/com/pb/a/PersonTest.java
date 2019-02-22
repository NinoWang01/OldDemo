package com.pb.a;

public class PersonTest {

	public static void main(String[] args) {
		Student st = new Student("", 23);
		/*
		 * 抽象类不能实例化 Person p = new Person();
		 * 	Person p = new Student("", 23)
		 * 这种方式是为了调用抽象父类中的普通方法
		 */
		Person p = new Student("", 23);
		p.hao();

		st.seacher();
		st.sleep();

	}
}
