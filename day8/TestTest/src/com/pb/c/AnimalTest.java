package com.pb.c;

public class AnimalTest {

	/*
	 * Animal:
	 */

	public static void main(String[] args) {

		/*
		 * 静态内部类的实例化方式
		 */
		Animal.Cat ac = new Animal.Cat();

		ac.lingXing = "善解人意";
		ac.speek();

	}

}
