package com.pb.d;

public class Car implements Motion, Product {

	public String product;
	public double price;

	public Car(String product, double price) {
		this.product = product;
		this.price = price;

	}

	@Override
	public void getPrice() {
		System.out.println("��Ʒ�Ƴ��ļ۸�Ϊ��" + this.price);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.product + "��ͣͣ������");
	}

	@Override
	public void hhh() {
		System.out.println("ʵ�ֵ��ǣ�ʵ�ֽӿڵĸ���ӿ��еĳ��󷽷�");

	}

}
