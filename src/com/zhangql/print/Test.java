package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Test {
	public static void main(String[] args){
		Lock lock = new ReentrantLock();
		Condition conditionA = lock.newCondition();
		Condition conditionB = lock.newCondition();
		 Condition conditionC = lock.newCondition();
	    
		Thread t1 = new Thread(new PrintA(lock,conditionA,conditionB));
		Thread t2 = new Thread(new PrintB(lock,conditionB,conditionC));
		Thread t3 = new Thread(new PrintC(lock,conditionC,conditionA));
		
		t1.start();
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
