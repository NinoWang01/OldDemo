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
		System.out.println("该品牌车的价格为：" + this.price);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.product + "车停停下来了");
	}

	@Override
	public void hhh() {
		System.out.println("实现的是：实现接口的父类接口中的抽象方法");

	}

}
