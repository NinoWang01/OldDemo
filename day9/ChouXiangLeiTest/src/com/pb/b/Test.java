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
	 * 静态方法,有参数的，接收的参数是
	 * Animal animal=new Animal();
	 * Animal animal=new Cat();
	 */
	public static void speek(Animal animal){
		if(animal instanceof Cat){
			Cat cat=(Cat) animal;
			cat.scream();
		}else{
			System.out.println("传进来的参数不是Cat类");
		}
		/*
		 * Car   作为接口
		 * 创建两个类，分别事项这个接口
		 * jeep  
		 * RedFlag
		 * 再写一个测试类，在测试类中声明一个方法，
		 * 有参数哦，通过传递不同类型的参数哦
		 * ，体验接口的使用
		 */
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
//		Dog dog=(Dog) animal;
//		dog.scream();
//		animal.scream();
//		animal.scream();
		
		
		
	}
	
	
}
