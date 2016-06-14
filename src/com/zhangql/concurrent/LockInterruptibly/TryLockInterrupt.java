package com.zhangql.concurrent.LockInterruptibly;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockInterrupt {
	private final Lock lock = new ReentrantLock();
	public void interrupt(){
		try {
			lock.lockInterruptibly();
			System.out.println("打印一下");
			System.out.println(Thread.currentThread().getName()+"中断前状态:"
											+Thread.currentThread().isInterrupted());
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName()+"中断后状态:"
											+Thread.currentThread().isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			System.out.println(Thread.currentThread().getName()+"中断最后状态:"
					+Thread.currentThread().isInterrupted());
			lock.unlock();
		}
	}
}
