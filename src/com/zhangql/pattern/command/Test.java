package com.zhangql.pattern.command;

public class Test {
	public static void main(String[] args){
		Recevier recevier = new Recevier();
		Command command = new MyCommand(recevier);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
