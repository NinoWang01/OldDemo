package com.pb.d;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip_a;
		// 如果说你没有输入机器名，他会认为就是本地机器
		if (args.length < 1) {
			ip_a = InetAddress.getLocalHost();
		} else {
			ip_a = InetAddress.getByName(args[0]);
		}
		System.out.println(ip_a);
	}

}
