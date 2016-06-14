package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintC implements Runnable{
	private Lock lock;

	private Condition conditionC;
	private Condition conditionA;
	

	public PrintC(Lock lock, Condition conditionC, Condition conditionA) {
		super();
		this.lock = lock;
		this.conditionC = conditionC;
		this.conditionA = conditionA;
	}



	@Override
	public void run() {
		while(true){
			if(lock.tryLock()){
				   try {
					System.out.print("C");
					System.out.println("");
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
