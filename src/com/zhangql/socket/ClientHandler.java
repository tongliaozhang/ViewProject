package com.zhangql.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
	
	private Socket socket;
	
	public ClientHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		InputStream in = null;
		InputStreamReader bfIn= null;
		BufferedReader reader= null ;
		
		PrintWriter writer= null;
		OutputStream out= null;
		try {
			in = socket.getInputStream();
			bfIn = new InputStreamReader(in);
			reader = new BufferedReader(bfIn);
			out = socket.getOutputStream();
			writer = new PrintWriter(out);
			
			String msg = reader.readLine();
			System.out.println("收到" + socket.getInetAddress() + "发送的: " + msg);
			writer.println(msg);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=in){
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(null!=bfIn){
					bfIn.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			
			try {
				if(null!=reader){
					reader.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			
			try {
				if(null!=out){
					out.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			
			try {
				if(null!=writer){
					writer.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		
	}

}
