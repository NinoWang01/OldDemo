package com.pb.b;

public class PersonTest {

	public static Object[] obj = { 12, "asdfa", 'a', true };

	/*
	 * int : Integer long : Long double : Double float :Float
	 * 
	 * char :Character
	 * 
	 * byte : Byte boolean : Boolean short :Short
	 */
	public static void main(String[] args) {
		int a = 0;
		Integer a1 = new Integer(6);// 该对象的hashCode()值是这个引用对象指向的那个值
		if (a == a1) {
			System.out.println(a == a1);
		}
//		System.out.println(a1.hashCode());
		if (a1.equals(a)) {
			System.out.println(a1.equals(a));

		}

		// Person p1 = new Person();
		// Person p2 = new Person();
		// new Person();
		// // 把p1和p2都赋值成空的
		// p1 = null;
		// p2 = null;

		// System.gc();

	}

}
