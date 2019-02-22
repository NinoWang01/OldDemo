package com.pb.e;

public class Plane implements Motion, Product {



	@Override
	public void productTest() {
		 System.out.println("来自于Product接口的方法实现");
		
	}
	@Override
	public void fly() {
		 System.out.println("来自于KindPlane接口的方法实现");
		
	}
	@Override
	public void isFly() {
		 System.out.println("来自于Motion接口的方法实现");
		
	}

	@Override
	public void isStop() {
		 System.out.println("来自于Motion接口的方法实现");
		
	}

}
