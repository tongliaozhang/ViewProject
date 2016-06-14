package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintA implements Runnable{
	private Lock lock;
	private Condition conditionA;
	private Condition conditionB;
	int count = 100;

	public PrintA(Lock lock,Condition conditionA,Condition conditionB) {
		super();
		this.lock = lock;
		this.conditionA = conditionA;
		this.conditionB = conditionB;
	}

	@Override
	public void run() {
		while(true){
			   int index = 0;
			   if(lock.tryLock()){
				   try {
					   if(index>count){
						   break;
					   }
					System.out.print("A");
					  index++;
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
