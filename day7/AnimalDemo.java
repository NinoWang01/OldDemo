/**
 * 父类引用指向子类对象
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

class AnimalDemo {
	public static void main(String[] args) {

		Animal amimal1=new Cat();//动物的引用指向猫的对象
		Animal amimal2=new Dog();//动物的引用指向狗的对象


	}

}
