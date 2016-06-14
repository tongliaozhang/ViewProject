package com.zhangql.pattern.abstractFactory;

public class Test {
	public static void main(String[] args){
		Sender mailSender = new MailSenderFactory().produce();
		mailSender.send();
		Sender smsSender = new SmsSendFactory().produce();
		smsSender.send();
		Sender wxSender = new WxSenderFactory().produce();
		wxSender.send();
	}
}
