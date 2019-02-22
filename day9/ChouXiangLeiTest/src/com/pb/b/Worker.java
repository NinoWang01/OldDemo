package com.pb.b;

/*
 * 当一个类实现接口的时候，必须要实现接口中的抽象方法
 * implements：是实现接口的关键字
 * 
 */
public class Worker implements JieKouTest {

	@Override
	public void hao() {
		System.out.println("我是一个好人，我要好好工作");

	}

	@Override
	public void huai() {
		System.out.println("我是一个好人，我不想工作"); 

	}

}
