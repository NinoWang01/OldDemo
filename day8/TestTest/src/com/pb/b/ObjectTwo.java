package com.pb.b;

public class ObjectTwo {

	public static void main(String[] args) {

		Object obj1 = new Object();
		
		Object obj2 = new Object();

		if (obj1.equals(obj2)) {
			System.out.println("��ͬһ������");
		} else {
			System.out.println("������ͬһ������");
		}

		obj1 = obj2;

		if (obj1.equals(obj2)) {
			System.out.println("��ͬһ������");
		} else {
			System.out.println("������ͬһ������");
		}

	}

}
