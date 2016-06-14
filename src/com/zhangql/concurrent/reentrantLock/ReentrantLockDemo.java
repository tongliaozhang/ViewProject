package com.zhangql.concurrent.reentrantLock;

import java.util.concurrent.CountDownLatch;

public class ReentrantLockDemo {
	public static void main(String[] args){
		final int  loopcount = 10000;
	    int thread = 10;
		
		final SafeSeqWithLock safeSeqWithLock = new SafeSeqWithLock();
		final CountDownLatch latch = new CountDownLatch(thread);
		for(int i=0;i<thread;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int j=0;j<loopcount;j++){
						safeSeqWithLock.inc();
					}
					System.out.println(Thread.currentThread().getName()+"  end");
					latch.countDown();
				}
			}).start();
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("finishi");
		System.out.println(safeSeqWithLock.get());
	}
}
