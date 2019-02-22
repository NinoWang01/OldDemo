package com.pb.android_107_12_01_test;

public class SmsInfo {

	private long date;// 短信的时间
	private int type;// 短信的数据类型
	private String body;// 短信内容
	private String address;// 短信的地址

	//
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SmsInfo() {

	}

	public SmsInfo(long date, int type, String body, String address) {
		super();
		this.date = date;
		this.type = type;
		this.body = body;
		this.address = address;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
