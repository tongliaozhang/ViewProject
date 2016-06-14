package com.zhangql.concurrent;

import java.util.concurrent.CountDownLatch;

public class AtomicTest {
	public static void main(String[] args){
		final int loopcount = 10000;
		int thread = 10;
		
		final NoSafeSeq  seq1 = new NoSafeSeq();
		final SafeSeq seq2 = new SafeSeq();
		
		final CountDownLatch latch = new CountDownLatch(thread);
		
		for(int i=0;i<thread;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int j=0;j<loopcount;j++){
						seq1.inc();
						seq2.inc();
					}
					latch.countDown();
				}
			}).start();
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("both have finished...."); 
		System.out.println("NoSafe="+seq1.get());
		System.out.println("Safe="+seq2.get());
		
	}
}
