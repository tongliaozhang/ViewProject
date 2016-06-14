package com.zhangql.pattern.abstractFactory;

public class SmsSendFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
