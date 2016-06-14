package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintC implements Runnable{
	private Lock lock;

	private Condition conditionC;
	private Condition conditionA;
	private int count = 100;

	public PrintC(Lock lock, Condition conditionC, Condition conditionA) {
		super();
		this.lock = lock;
		this.conditionC = conditionC;
		this.conditionA = conditionA;
	}



	@Override
	public void run() {
		while(true){
			int index = 0;
			if(lock.tryLock()){
				   try {
					if(index>count) break;
					
					System.out.print("C");
					index++;
					   conditionA.signal();
					   conditionC.await();
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
