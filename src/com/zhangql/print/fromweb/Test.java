package com.zhangql.print.fromweb;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	ReentrantLock lock = new ReentrantLock();
	Condition  conditionA = lock.newCondition();
	Condition  conditionB = lock.newCondition();
	Condition  conditionC = lock.newCondition();
	
	public void method() throws Exception{
		new Thread(new PrintThread(conditionC, conditionA, lock, "A")).start();
		new Thread(new PrintThread(conditionA, conditionB, lock, "B")).start();
		new Thread(new PrintThread(conditionB, conditionC, lock, "C")).start();
		
		//t1.start();
		//t2.start();
		//t3.start();
		
	}
	
	public static void main(String[] args) throws Exception{
		new Test().method();
	}
}
