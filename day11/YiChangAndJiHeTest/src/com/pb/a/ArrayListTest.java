package com.pb.a;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest {

	/*
	 * 创建集合对象的常见方式
	 *(1)ArrayList 集合变量名=new ArrayList();
      (2)ArrayList 集合变量名=new ArrayList(int capcity);
	 */
	public static void main(String[] args) {
		
//		Collection  coll= new ArrayList();
		ArrayList list = new ArrayList(10);
		
		//给集合添加元素
		list.add("张散发");
		list.add(23);
		list.add("男");
		list.add(3016110);
		
		
		
		
		list.add(null);
		
		list.add("jklj");
		list.add(30);
		
		//输出集合的长度
//		 System.out.println(list.size());
		 //输出集合中的元素
//		 System.out.println(list.get(0));
//		 System.out.println(list.get(1));
		
		 
//		 list.remove(5);
		 
//		 System.out.println(list);
//		 list.clear();
		 System.out.println(list.get(4));
		 
		 
		 
		
		

	}
	
	
	

}
