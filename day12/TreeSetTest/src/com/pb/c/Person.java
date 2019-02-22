package com.pb.c;

/*
 * <  > ：它里边的泛型类型一般情况用  T  E
 */
public class Person <A> {
	
	/*
	 * age:放在栈中 value:放在堆里边
	 */
	public A age;

	public A name;

	public void save(A a) {
		this.age = a;
	}
 

	public A get() {
		return age;

	}

}
