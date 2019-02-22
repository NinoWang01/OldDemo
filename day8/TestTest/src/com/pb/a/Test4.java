package com.pb.a;

public class Test4 extends Person{
	private float f =10.6f;
	int i=16;
	static int si=10;
	//A、x.f	  B、this.si	 C、X5_1_1.i	 D、X5_1_1.f
	public static void main(String[] args) {
		hao();
	
	}

	public static void hao(){
		Test4 x=new Test4();
		System.out.println(x.f);
//		System.out.println(this.si);
	 
	}

}
