package com.pb.a;

public class Bird {
	public String name;
	public int age;
	public String sex;
	public String PersnalSkill;

	/*
	 * ���췽�� ���췽�����Ե��ù��췽�� ͨ��this�ؼ���
	 */
	public Bird() {
		super();// �����˸�����޲εĹ��췽��
	}

	public Bird(String name) {
		this();// �����˱�����޲����Ĺ��췽��
		// ͬ��this�ؼ���
		this.name = name;
	}

	public Bird(String name, int age) {
		this(name);// �����˱�����޲����Ĺ��췽��
		// ͬ��this�ؼ���
		this.age = age;
	}

	public Bird(int age, String name) {
		this(name);// �����˱�����޲����Ĺ��췽��
		// ͬ��this�ؼ���
		this.age = age;
	}

	public Bird(String name, int age, String sex) {
		this(name, age);
		// ͬ��this�ؼ���
		this.sex = sex;
	}

	public Bird(String name, int age, String sex, String PersnalSkill) {
		this(name, age, sex);
		// ͬ��this�ؼ���
		this.PersnalSkill = PersnalSkill;
	}

	public void hao() {
		System.out.println("����һ��Bird���һ����ͨ����");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hao1() {

	}
	public int hao1(String s, int a) {
		
		return a;
	}

}
