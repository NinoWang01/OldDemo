/**
 * ��������ָ���������
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

		Animal amimal1=new Cat();//���������ָ��è�Ķ���
		Animal amimal2=new Dog();//���������ָ�򹷵Ķ���


	}

}
