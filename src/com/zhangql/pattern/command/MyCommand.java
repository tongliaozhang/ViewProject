package com.zhangql.pattern.command;

public class MyCommand implements Command{

	private Recevier receiver;
	
	public MyCommand(Recevier recevier) {
		this.receiver = recevier;
	}	
	@Override
	public void exe() {
		receiver.action();
	}
	
}
