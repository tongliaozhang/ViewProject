package com.zhangql.concurrent.LockNew;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {
	private final Lock lock = new ReentrantLock();
	
	public void take() throws Exception{
		if(lock.tryLock(2000,TimeUnit.NANOSECONDS)){
			 try {
				 
			}finally{
				lock.unlock();
			}
		}else{
			System.out.println("***take没有获取到锁..."); 
		}
	}
	
	public void put()throws Exception{
		if(lock.tryLock(2000,TimeUnit.NANOSECONDS)){
			try {
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				lock.unlock();
			}
		}else{
			System.out.println("~~~put没有获取到锁..."); 
		}
	}
	
	public static void main(String[] args){
		TryLockDemo t = new TryLockDemo();
		new Thread(new Take(t)).start();
		new Thread(new Put(t)).start();
	}
}
