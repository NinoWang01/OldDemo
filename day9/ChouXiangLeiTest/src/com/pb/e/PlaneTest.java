package com.pb.e;

public class PlaneTest {
	public static void main(String[] args) {

		Plane p = new Plane();

		Motion mo = p;
		Product pro = (Product) mo;
		KindPlane kpl = pro;// 理解成向上

//		p.fly();
//		p.isFly();
//		p.isStop();
//		p.productTest();
//		mo.fly();
//		mo.isFly();
//		mo.isStop();
		
//		pro.productTest();
//		pro.fly();
		
		kpl.fly();
		
		
		
		

	}
}
