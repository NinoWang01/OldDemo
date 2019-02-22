package com.pb.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		// 创建服务
		ServerSocket server;
		try {
			// 实例化了一个服务，并添加了一个端口号(服务器的存在)
			server = new ServerSocket(1234);
			Socket sk = server.accept();// 接受别人的请求连接
			// 缓存的读写
			BufferedReader br = new BufferedReader(new InputStreamReader(
					sk.getInputStream()));
			System.out.println(br.readLine());
			// 关流
			br.close();
			// 关服务
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
