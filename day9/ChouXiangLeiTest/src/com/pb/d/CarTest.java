package com.pb.d;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car("奔驰", 100.0);
		/*
		 * 让子类接口指向实现它的那个类的对象 ，然后再把自身引用对象，给他的父类接口
		 */
		Motion mo = new Car("宝马", 150.0);
		Product pd = (Product) mo;
		Action ac = mo;
		mo.stop();
		pd.getPrice();
		ac.hhh();
 
	}
	/*
	 * 要求：
	 * 飞机    父接口：  KindPlane   
	 * Motion 子接口   表示动作
	 * Product 子接口 表示品牌
	 * 写一个类，Plane  同时实现Motion和Product这两个接口
	 * 测试类，在测试类中，Plane 的实例化对象能够多角色转换
	 * 分别调用不同的方法
	 */
	
	
	
	
	
	
	
	
	
	
	
}
