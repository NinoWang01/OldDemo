package com.pb.e;

public class Plane implements Motion, Product {



	@Override
	public void productTest() {
		 System.out.println("������Product�ӿڵķ���ʵ��");
		
	}
	@Override
	public void fly() {
		 System.out.println("������KindPlane�ӿڵķ���ʵ��");
		
	}
	@Override
	public void isFly() {
		 System.out.println("������Motion�ӿڵķ���ʵ��");
		
	}

	@Override
	public void isStop() {
		 System.out.println("������Motion�ӿڵķ���ʵ��");
		
	}

}
