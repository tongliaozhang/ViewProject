package com.zhangql.pattern.abstractFactory;

public class MailSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
