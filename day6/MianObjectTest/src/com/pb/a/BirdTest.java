package com.pb.a;

public class BirdTest {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.name = "鹦鹉";
		bird.age = 2;
		System.out.println(bird.getName() + " " + bird.getAge());

		/*
		 * 有参数的构造方法作用：就是在对象实例化的时候，直接赋值
		 */

		Bird bird1 = new Bird("八哥", 2);
		System.out.println(bird1.getName() + " " + bird1.getAge());

		Bird birdd = new Bird("");
		Bird birdss = new Bird(8, "");
		/*
		 * 方法的重载： 1、方法的名字必须一致 2、方法的放回类型不一样 3、方法的参数顺序不一样 4、方法的修饰符可以不一样
		 * 
		 * 那么这样的两个方法，就叫方法的重载
		 */
		
		
		
		
		
		
		
		/*
		 *  
		 *  public static int count;//存放Person类的对象创建的次数
			public String name; //姓名
			public char sex; //性别
			public int age;  //年龄
			public double height;  //身高
			public String type;  //性格
		 */
		/*使用到this关键字，在构造方法之间互相调用
		 * 	public Bird(String name, int age, String sex) {
				this(name, age);
				// 同过this关键字
				this.sex = sex;
			}
			public Bird(String name, int age, String sex, String PersnalSkill) {
				this(name, age, sex);
				// 同过this关键字
				this.PersnalSkill = PersnalSkill;
	}
		 */
		
		
		
		
		
		
		
		
		
		
		

	}


}
