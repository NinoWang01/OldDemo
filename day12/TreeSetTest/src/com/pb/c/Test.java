package com.pb.c;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		/*
		 * 泛型的使用：
		 * <数据类型>
		 * 数据类型：常见集中数据类型包装类，类类型，以及String
		 * 
		 * ArrayList要求元素类型必须是引用类型，不能是基本数据类型。
			若要设置基本数据类型为集合元素，必须使用包装类。例如：
			ArrayList<Integer>
			ArrayList<Long>
			ArrayList<Byte>
			ArrayList<Short>
			ArrayList<Character>
			ArrayList<Double>
			ArrayList<Float>
			ArrayList<Boolean>
			不会乱，list存储数据数据类型固定，
			开发代码的时候，提前解决数据强转时候发生的错误
		 */
		// 这个集合被泛型，限定存储到集合中的元素的数据类型
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Boolean> list1 = new ArrayList<Boolean>();
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		//存储数据
		list.add(345);
		list.add(3);
		list.add(56);
		list.add(23);
		Iterator it=list.iterator();
		while(it.hasNext()){
			//强转,不需要其他的代码
			Integer s=(Integer) it.next();
			System.out.println(s);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
