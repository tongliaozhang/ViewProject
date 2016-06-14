package com.zhangql.pattern.abstractFactory;

public class WxSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new WxSender();
	}

}
