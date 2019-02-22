/**
 * 向下转型。
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

		Animal a=new Cat();
		
		Cat c=(Cat)a;//向下转型
		c.eat();
		c.catchMouse();
		
		


	}



}
