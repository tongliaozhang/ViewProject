package com.zhangql.pattern.decorator;

public class Source implements Sourceable{

	@Override
	public void methodA() {
		System.out.println("source class methodA");
	}
	
}
