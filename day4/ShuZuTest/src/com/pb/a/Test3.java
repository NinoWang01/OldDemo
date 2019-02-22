package com.pb.a;

public class Test3 {
	

	
	
	
	
	

	/*
	 * 一个用static修饰的方法或者函数中； 不能直接应用一个非静态的变量，方法（也叫函数）或者函数；
	 */
	public static void main(String[] args) {
		Person p = new Person();
		// 如果说一个类想调用自身的方法和属性，通过“.”来实现，如下：
		p.age = 20;
		p.setName("张三丰");

		System.out.println(p.getName() + p.getAge());

		p.eat("");
		HaoHao hao = new HaoHao();
		hao.eat();
		hao.run();
		hao.sleep();
		hao.shit();
		// hao();
		tian(9,"retwert" );
	}

	// 输出语句
	/*
	 * public:修饰符，修饰方法的使用权限
	 *  static:修饰方法的状态， 
	 *  void:指的是方法返回是空的，没有，
	 * hao：方法名字声明和定义，遵循的是标识符定义规则
	 *  ()：这对括号，括号里可能传进一些参数 
	 *  {代码块;}:这是方法的主体，业务逻辑处理，都在这里
	 */
	/*
	 * 要求：创建一个类，针对dog，
	 * 添加它的方法以及他的属性，有参数和无参数方法
	 * 属性：跑，叫、吃、age、sex、name
	 * 
	 * 可以写成一个类（可运行）
	 * 也可以写成不同的类
	 * 
	 * 
	 */
	public static void hao() {
		System.out.println("这是一个方法");
	}

	public void huai() {
		System.out.println("这是一个方法");
	}

	public static void tian(int a, String s) {
		
		
		System.out.println("qwetrertsydyjuiy");

	}

}