package com.zhangql.concurrent.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SafeSeqWithLock {
	private long count = 0;
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void inc(){
		lock.lock();
		try {
			count++;
		}finally{
			lock.unlock();
		}
	}
	
	public long get(){
		return count;
	}
}
