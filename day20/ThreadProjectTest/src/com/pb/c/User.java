package com.pb.c;

public class User extends Thread {
	public  int money=1000;
	// 创建构造方法
	public User(String name) {
		this.setName(name);
	}
	// 当用户取钱的时候就调用run
	@Override
	public void run() {
		if(money>=400){
			System.out.println(this.getName()+"取出400元");
			//自身减400
			money-=400;
			System.out.println("剩余的钱数："+money);
			
		}else{
			System.out.println("余额不足");
		}
	}

}
