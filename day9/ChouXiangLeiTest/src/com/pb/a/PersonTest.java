package com.pb.a;

public class PersonTest {

	public static void main(String[] args) {
		Student st = new Student("", 23);
		/*
		 * �����಻��ʵ���� Person p = new Person();
		 * 	Person p = new Student("", 23)
		 * ���ַ�ʽ��Ϊ�˵��ó������е���ͨ����
		 */
		Person p = new Student("", 23);
		p.hao();

		st.seacher();
		st.sleep();

	}
}
