package com.pb.f;

public class TestThird extends Week {
	/*
	 * (non-Javadoc)
	 * 
	 * 如果说抽象类中有抽象方法， 
	 * 那么子类在继承这个抽象类的时候 
	 * 一定要重写其抽象父类中的抽象方法
	 */

	@Override
	public void dayChangeNight1() {
		System.out.println("昼夜交替");
		System.out.println("多云转晴");

	}

}
