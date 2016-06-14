package com.zhangql.pattern.decorator;

public class Decorator implements Sourceable{
	private Sourceable source;
	
	public  Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void methodA() {
		 System.out.println("before decorator!");  
		 source.methodA();
	     System.out.println("after decorator!"); 
		 System.out.println("Decorator class methodA");
	}
	
}
