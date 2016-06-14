package com.zhangql.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args){
		
		int count = 10;
		final CountDownLatch  latch = new CountDownLatch(count);
		for(int i=1;i<=count;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.currentThread().sleep(2* 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" is finished!");
					latch.countDown();
				}
			}, i+"").start();
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("now all threads have finished"); 
		
	}

	
	
	
}
