package com.zhangql.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args){
		int port = 6789;
		ServerSocket  server = null;
		try {
			server = new ServerSocket(port);
			System.out.println("服务器已经启动...");
			while(true){
				Socket socket = server.accept();
				new Thread(new ClientHandler(socket)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
