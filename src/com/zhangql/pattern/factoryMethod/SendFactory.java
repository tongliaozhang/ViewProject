package com.zhangql.pattern.factoryMethod;

public class SendFactory {
	public Sender	 produce(String type) {
		
		Sender sender = null;
		
		/*if("mail".equals(type)){
			sender = new MailSender();
		}
		if("sms".equals(type)){
			sender = new SmsSender();
		}*/
		switch (type) {
		case "sms":
			sender = new SmsSender();
			break;
		case "mail":
			sender = new MailSender();
			break;
		default:
			System.out.println("error type Exception!");
			break;
		}
		return sender;
	}
	
	public static void main(String[] args){
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		Sender sender1 = factory.produce("mail");
		Sender sender2 = factory.produce("abc");
		
		sender.send();
		sender1.send();
		sender2.send();
	}
}
