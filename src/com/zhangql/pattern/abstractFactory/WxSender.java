package com.zhangql.pattern.abstractFactory;

public class WxSender implements Sender {

	@Override
	public void send() {
		System.out.println("Send Wx ......");
	}

}
