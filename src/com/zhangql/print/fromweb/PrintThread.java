package com.zhangql.print.fromweb;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThread implements Runnable{
	Condition condOwn;  
    Condition condNext;  
    ReentrantLock lock;  
    String name;  
    int SIZE = 10;
	public PrintThread(Condition condOwn, Condition condNext,
			ReentrantLock lock, String name) {
		super();
		this.condOwn = condOwn;
		this.condNext = condNext;
		this.lock = lock;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			lock.lock();
			try {
				System.out.print(name);
				if(i == SIZE){
					condNext.signal();
				}else{
					condNext.signal();
					condOwn.await();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	}  
    
}
