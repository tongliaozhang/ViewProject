package com.zhangql.pattern.factoryMethod;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send Mail.....");
	}

}
