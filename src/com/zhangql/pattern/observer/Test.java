package com.zhangql.pattern.observer;

public class Test {
	public static void main(String[] args){
		Subject sub = new MySubject();
		Observer cObserver = new ObserverB();
		sub.add(cObserver);
		sub.add(new ObserverA());
		sub.add(cObserver);
		sub.operation();
	}
}
