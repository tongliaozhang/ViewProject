package com.zhangql.pattern.bridge;

public class SourceSubA implements Sourceable{

	@Override
	public void method() {
		System.out.println("subA method");
	}

}
