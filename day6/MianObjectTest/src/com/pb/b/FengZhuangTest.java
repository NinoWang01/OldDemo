package com.pb.b;

public class FengZhuangTest {

	public static void main(String[] args) {
		FengZhuang fz = new FengZhuang();
		// ����ָ��ĳһ��ʵ��������
		fz.setAge(23);
		fz.setName("����");
		/*
		 * ���Լ�����Ϣд��һ����װ��
		 */

		/*
		 * new FengZhuang().hao();JVM ����Ϊ��
		 * ������û���κ����� ֱ�Ӹ�����յ���
		 * �������������ص㣺����û�����ñ���
		 */
		FengZhuang ff = new FengZhuang();
		String ss = new FengZhuang().hao();
		
		
	}

}
