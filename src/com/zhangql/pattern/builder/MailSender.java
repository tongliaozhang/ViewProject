package com.zhangql.pattern.builder;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("Send Mail.....");
	}

}
