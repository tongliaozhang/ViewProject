package com.zhangql.pattern.abstractFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send Mail.....");
	}

}
