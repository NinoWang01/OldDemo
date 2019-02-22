package com.pb.b;

public class CatTest {
	public static void main(String[] args) {

		/*
		 * 子类在创建实例化对象的时候，完全按照父类的构造方法创建的
		 */
//		Cat cat = new Cat("肥肥","波斯猫");
		Cat cat = new Cat("","");
		
		cat.name="大熊";
		cat.age=2;
		cat.kind="波斯猫";
		cat.sex="公";
		cat.lingXing="很懂人性";
		cat.miaoMiao="喵喵的叫";
		cat.hao();
//		System.out.println(cat.name+" "+cat.kind);
	}
	
	
	
	
	
	
	
	
	
	/*
	 * 用继承的方式
	 * 父类： Person  
	 * 
	 * 子类：学生       
	 * 子类：工人   
	 * 子类：教师   
	 * 
	 * 测试类：main
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
