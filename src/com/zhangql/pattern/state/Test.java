package com.zhangql.pattern.state;

public class Test {
	public static void main(String[] args){
		State state = new State();
		state.setValue("B");
		Context context = new Context(state);
		context.methodA();
	}
}
