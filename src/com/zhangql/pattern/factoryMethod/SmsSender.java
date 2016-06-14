package com.zhangql.pattern.factoryMethod;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send SMS ......");
	}

}
