package com.zhangql.pattern.observer;

public class ObserverA implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverA has received!");
	}

}
