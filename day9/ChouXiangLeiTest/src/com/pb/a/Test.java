package com.pb.a;

public class Test {

	public static void main(String[] args) {

		Car car =new Car();
		//多态当中的向上转型
		Jeep jeep = new Jeep();
		car=jeep;
		
		
		RedFlag redFlag = new RedFlag();
		car=redFlag;
		
		
		run(car);	
	}

	// 声明方法
	public static void run(Car ca) {
		/*
		 * Car car：这个是传进来的参数哦类型，
		 */
		if (ca instanceof Jeep) {
			
			Jeep jeep = (Jeep) ca;
			
			jeep.run();
		}else{
			System.out.println("传进来的参数哦不属于RedFlag的实例");
		}

	}

}
