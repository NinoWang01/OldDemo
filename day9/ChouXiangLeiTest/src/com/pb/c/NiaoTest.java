package com.pb.c;

/*
 * 继承呢是单一的，而实现接口，可以同时实现多个接口
 * ，多个接口之间用逗号隔开
 * 
 * 即继承了父类又实现了接口
 * 
 * 
 */
public class NiaoTest extends BirdFather implements Bird, XiaoJaQue,Hello {

	@Override
	public void eat() {
		System.out.println("我是重写的接口XiaoJaQue里的方法eat()，做了具体实现");

	}

	@Override
	public void fly() {
		System.out.println("我是重写的接口Bird里的方法fly()，做了具体实现");

	}

	public void sleep() {

		System.out.println("本身具有的普通方法");
	}

}
