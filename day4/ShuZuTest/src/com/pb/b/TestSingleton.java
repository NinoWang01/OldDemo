package com.pb.b;

import org.junit.Test;

public class TestSingleton {
	  @Test
	    public void test(){
	        long beginTime1 = System.currentTimeMillis();
	        for(int i=0;i<100000;i++){
	            Singleton1.getInstance();            
	        }
	        System.out.println("����1����ʱ�䣺"+(System.currentTimeMillis()-beginTime1));
	        long beginTime2 = System.currentTimeMillis();
	        for(int i=0;i<100000;i++){
	            Singleton1.getInstance();            
	        }
	        System.out.println("����2����ʱ�䣺"+(System.currentTimeMillis()-beginTime2));
	    }
}
