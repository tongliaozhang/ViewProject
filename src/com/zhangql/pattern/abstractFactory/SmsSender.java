package com.zhangql.pattern.abstractFactory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send SMS ......");
	}

}
