package com.zhangql.proxy;

public class RealObject implements MyObject{

	@Override
	public void doSomething() {
		System.out.println("Real Object do someting ....");
		
	}

	@Override
	public void doOther() {
		System.out.println("Real Object do someting ....");
	}

}
