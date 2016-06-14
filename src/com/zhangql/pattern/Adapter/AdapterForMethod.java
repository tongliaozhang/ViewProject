package com.zhangql.pattern.Adapter;

public class AdapterForMethod implements Targetable {

	private Source source;
	
	public AdapterForMethod(Source source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		source.method();
	}

	@Override
	public void method_target() {
		System.out.println("this is the targetable method!");  
	}

}
