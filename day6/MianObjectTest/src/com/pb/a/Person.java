package com.pb.a;

public class Person {
	public String name;
	public int age;
	public String sex;

	/*
	 * ��̬����� �е�Ӧ�ó���
	 */
	static {
		System.out.println("���Ǿ�̬�����,��Ҫ��ִ�У�����Person");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
	

}
