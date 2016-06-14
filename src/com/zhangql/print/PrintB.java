package com.zhangql.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintB implements Runnable{
	private Lock lock;
	private Condition conditionB;
	private Condition conditionC;
	int count = 100;
	

	public PrintB(Lock lock, Condition conditionB, Condition conditionC) {
		super();
		this.lock = lock;
		this.conditionB = conditionB;
		this.conditionC = conditionC;
	}



	@Override
	public void run() {
		int index = 0;
		while(true){
			if(lock.tryLock()){
				   try {
					if(index>count){
						break;
					}
					System.out.print("B");
					   conditionC.signal();
					   conditionB.await();
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
