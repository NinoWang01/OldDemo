package com.pb.c;

/*
 * �̳����ǵ�һ�ģ���ʵ�ֽӿڣ�����ͬʱʵ�ֶ���ӿ�
 * ������ӿ�֮���ö��Ÿ���
 * 
 * ���̳��˸�����ʵ���˽ӿ�
 * 
 * 
 */
public class NiaoTest extends BirdFather implements Bird, XiaoJaQue,Hello {

	@Override
	public void eat() {
		System.out.println("������д�Ľӿ�XiaoJaQue��ķ���eat()�����˾���ʵ��");

	}

	@Override
	public void fly() {
		System.out.println("������д�Ľӿ�Bird��ķ���fly()�����˾���ʵ��");

	}

	public void sleep() {

		System.out.println("������е���ͨ����");
	}

}
