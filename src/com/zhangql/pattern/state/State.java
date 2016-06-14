package com.zhangql.pattern.state;

public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void methodA(){
		System.out.println("execute the first opt!");  
	}
	
	public void methodB(){
		System.out.println("execute the second opt!");  
	}
}
