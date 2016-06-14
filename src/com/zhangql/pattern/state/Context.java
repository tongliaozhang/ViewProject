package com.zhangql.pattern.state;

public class Context {
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void methodA(){
		if(state.getValue().equals("A")){
			state.methodA();
		}
		if(state.getValue().equals("B")){
			state.methodB();
		}
	}
}
