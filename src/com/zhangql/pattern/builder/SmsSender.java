package com.zhangql.pattern.builder;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send SMS ......");
	}

}
