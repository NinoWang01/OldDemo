/**
 * ����ת�͡�
 */
package com.chinasofti.ch11.model1;

abstract class Animal {
	abstract void eat();

}

class Dog extends Animal {
	void eat() {
		System.out.println("�й�ͷ");
	}

	void lookHome() {
		System.out.println("����");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("����");
	}

	void catchMouse() {
		System.out.println("ץ����");
	}
}

class AnimalDemo {
	public static void main(String[] args) {

		Animal a=new Cat();
		
		Cat c=(Cat)a;//����ת��
		c.eat();
		c.catchMouse();
		
		


	}



}
