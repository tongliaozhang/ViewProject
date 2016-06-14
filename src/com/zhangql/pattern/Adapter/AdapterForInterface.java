package com.zhangql.pattern.Adapter;

public class AdapterForInterface extends AbstractSource{

	/**
	 * 重写了抽象类方法
	 */
	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	/**
	 * 重写了抽象类方法
	 */
	@Override
	public void methodB() {
		System.out.println("methodB");
	}
		
}
