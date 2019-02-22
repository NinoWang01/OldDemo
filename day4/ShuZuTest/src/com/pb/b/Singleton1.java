package com.pb.b;

public class Singleton1 {
	private Singleton1(){
        System.out.println("createSingleton");
    }
    private static Singleton1 instance = null;
    public static synchronized Singleton1 getInstance(){
        return instance==null?new Singleton1():instance;
    }
    public static void testSingleton(){
        System.out.println("CreateString");
    }
}
