package com.pb.a;

//������
public class PersonTest {

	/*
	 * ������ڣ�������Ǿ�̬
	 * 
	 * @param args static����Ϊ����,����˭��˭���Ǿ�̬��
	 */
	public static int a = 1;

	public static void main(String[] args) {
		// ʵ����һ������
		Person p = new Person();
		// ��p���廯ָ��һ������
		p.name = "������";
		p.age = 110;
		p.sex = "��";

		System.out.println("���֣�" + p.getName() + " " + "�Ա�" + p.getSex() + " "
				+ "���䣺" + p.getAge());

	}

	// ���η���
	static  {
		System.out.println("�����������еľ�̬�����,����PersonTest");

	}

}
