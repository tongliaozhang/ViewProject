package com.zhangql.concurrent.condition;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
	final Lock  lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();
	
	final Object[] items = new Object[5];
	int putptr,takeptr,count;
	
	public void put(Object x) throws InterruptedException{
		lock.lock();
		try {
			while(count == items.length){
				System.out.println(new Date() + " put  is to wait....");
				notFull.await();
			}
			items[putptr] = x;
			if(++putptr == items.length){
				putptr = 0;
			}
			++count;
			notEmpty.signal();
		} finally{
			lock.unlock();
		}
	}
	
	public Object take() throws InterruptedException{
		lock.lock();
		try {
			while (count == 0) {
				System.out.println(new Date() + " take  is to wait....");
				notEmpty.await();
			}
			Object x = items[takeptr];
			if(++takeptr == items.length){
				takeptr = 0;
			}
			--count;
			notFull.signal();
			return x;
		} finally {
			lock.unlock();
		}
		
	}
}
 