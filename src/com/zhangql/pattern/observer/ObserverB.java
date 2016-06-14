package com.zhangql.pattern.observer;

public class ObserverB implements Observer{

	@Override
	public void update() {
		System.out.println("ObserverB has received!");
	}
	
}
