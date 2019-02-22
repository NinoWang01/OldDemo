package com.pb.android_107_9_03_sqlite_test.bean;

public class Account {

	// 商品的ID
	private long id;
	private String name;
	private Integer balance;

	public Account(long id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Account(String name, Integer balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}

}
