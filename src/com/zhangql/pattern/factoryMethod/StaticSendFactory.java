package com.zhangql.pattern.factoryMethod;

public class StaticSendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
	public static void main(String[] args){
		Sender sender = StaticSendFactory.produceMail();
		sender.send();
	}
}
