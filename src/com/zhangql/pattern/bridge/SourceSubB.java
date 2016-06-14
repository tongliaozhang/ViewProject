package com.zhangql.pattern.bridge;

public class SourceSubB implements Sourceable	{

	@Override
	public void method() {
		System.out.println("subB method");
	}

}
