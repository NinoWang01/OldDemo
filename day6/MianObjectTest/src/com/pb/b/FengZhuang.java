package com.pb.b;

public class FengZhuang {
	/*
	 * private ���������٣�������˽�л����Ժͷ���
	 */
	private static String name;
	private int age;

	public FengZhuang() {

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		FengZhuang.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String hao() {
		return "woshi";
		//System.out.println("��������FengZhuang�����ķ���");
	}
}
