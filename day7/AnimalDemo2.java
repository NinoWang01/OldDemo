/**
 * 向上转型。
 */
package com.chinasofti.ch11.model1;

abstract class Animal {
	abstract void eat();

}

class Dog extends Animal {
	void eat() {
		System.out.println("啃骨头");
	}

	void lookHome() {
		System.out.println("看家");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("吃鱼");
	}

	void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class AnimalDemo1 {
	public static void main(String[] args) {

		Animal a=new Cat();
		a.eat();/// 向上转型,只能使用父类中的方法
		a.lookHome();// 报错！向上转型,不能使用子类中的方法
		
		


	}

}
