package com.pb.c;

public class NeiBuLeiTest {
	public int a;
	public String b;

	/*
	 * �ڲ��ࣺ������ڲ���������һ���µ���
	 */

//	public static void main(String[] args) {
//
//		// ����һ���ڲ������,�ڲ�������ʵ����
//		NeiBuLeiTest.Hao nbth = new NeiBuLeiTest().new Hao();
//		nbth.age=23;
//		nbth.name="������";
//		nbth.shuChu();
//
//	}

	/*
	 * Hao:�ͷ����ڲ���Ķ��壬Hao�����ڲ���
	 */
	public class Hao  extends NeiBuLeiTest{
		public int age;
		public String name;

		public void shuChu() {
			System.out.println("������" + age + "\t" + "���䣺" + name);
		}

		@Override
		public void hhh() {
			super.hhh();
		}
 
	}
	
	public void hhh(){
		System.out.println("�����ⲿ��ķ���");
	}
	
	
	
	
	

}
