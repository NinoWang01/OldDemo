package com.pb.d;

public class Test {

	public static void main(String[] args) {

		/*
		 * �����ڲ���:��������Ӧ�ñ����� ��д����ķ�����ֻҪ�������ڲ��࣬������ȥ��д����ķ���
		 */
		new HelloTest() {
			@Override
			public void huai() {
				// super.huai();
				System.out.println("���ǲ������е�huai()����");
			}
		}.huai();
		new HelloTest().huai();
		
		
		
		

	}
}
