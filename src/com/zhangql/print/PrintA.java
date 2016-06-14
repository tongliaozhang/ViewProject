package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintA implements Runnable{
	private Lock lock;
	private Condition conditionA;
	private Condition conditionB;

	public PrintA(Lock lock,Condition conditionA,Condition conditionB) {
		super();
		this.lock = lock;
		this.conditionA = conditionA;
		this.conditionB = conditionB;
	}

	@Override
	public void run() {
		while(true){
			   if(lock.tryLock()){
				   try {
					System.out.print("A");
					   conditionB.signal();
					   conditionA.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				   
			   }
		}
		
	}
}
