package com.pb.d;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) {

		// 创建一个Socket,去连接服务器
		Socket client;
		// 打印信息
		PrintStream ps;

		try {
			// 请求连接端口号为1234的服务器
			client = new Socket("localhost", 1234);
			System.out.println("如果连接成功你就输出");
			// 实例化ps
			ps = new PrintStream(client.getOutputStream());
			ps.println("Hello");
			// 关闭流
			ps.close();
			// 关闭Socket
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
