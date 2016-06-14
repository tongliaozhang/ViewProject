package com.zhangql.pattern.observer;

public class MySubject extends	 AbstractSubject{

	@Override
	public void operation() {
		System.out.println("MySubject is operation!");
		notifyObservers();
	}
 
}
