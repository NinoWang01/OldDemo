package com.pb.b;

public class Person {

	/*
	 * �� ȫ�ֱ���������λ�����У���α���Ҳ���ٷ������С�Ҳ��̬����鵱�� ��һ�㶼��ȫ�ֱ��������£�ʹ�÷�Χ������������κ�λ�ã���static
	 * ���εķ��������飬�����ʹ��ȫ�ֱ�������ô�������������Ǿ�̬��
	 */
	public static String name;
	public int age;
	public String sex;

	/*
	 * ���췽���Ĳ�����name��age �������Ǿֲ����� �ֲ�������ָ���Ƕ����ڷ������У����߾ֲ�����鵱�еı���
	 */

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void hao() {
		// �ֲ�������λ��hao()������
		String name = "���޼�";

		System.out.println(this.name);
		System.out.println(name);

	}

}
