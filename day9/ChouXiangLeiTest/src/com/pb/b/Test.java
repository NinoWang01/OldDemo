package com.pb.b;

public class Test {
	
	
	public static void main(String[] args) {
		Cat cat2=new Cat();
		Dog dog2=new Dog();
		//Animal cat2=new Cat();
//		speek(cat2);
		speek(dog2);
		
		
		
		
	}
	
	
	/*
	 * ��̬����,�в����ģ����յĲ�����
	 * Animal animal=new Animal();
	 * Animal animal=new Cat();
	 */
	public static void speek(Animal animal){
		if(animal instanceof Cat){
			Cat cat=(Cat) animal;
			cat.scream();
		}else{
			System.out.println("�������Ĳ�������Cat��");
		}
		/*
		 * Car   ��Ϊ�ӿ�
		 * ���������࣬�ֱ���������ӿ�
		 * jeep  
		 * RedFlag
		 * ��дһ�������࣬�ڲ�����������һ��������
		 * �в���Ŷ��ͨ�����ݲ�ͬ���͵Ĳ���Ŷ
		 * ������ӿڵ�ʹ��
		 */
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
//		Dog dog=(Dog) animal;
//		dog.scream();
//		animal.scream();
//		animal.scream();
		
		
		
	}
	
	
}
