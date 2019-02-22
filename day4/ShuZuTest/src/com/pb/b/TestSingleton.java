package com.pb.b;

import org.junit.Test;

public class TestSingleton {
	  @Test
	    public void test(){
	        long beginTime1 = System.currentTimeMillis();
	        for(int i=0;i<100000;i++){
	            Singleton1.getInstance();            
	        }
	        System.out.println("单例1花费时间："+(System.currentTimeMillis()-beginTime1));
	        long beginTime2 = System.currentTimeMillis();
	        for(int i=0;i<100000;i++){
	            Singleton1.getInstance();            
	        }
	        System.out.println("单例2花费时间："+(System.currentTimeMillis()-beginTime2));
	    }
}
