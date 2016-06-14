package com.zhangql.concurrent.condition;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class BoundedBufferTest {
	public static void main(String[] args){
		final BoundedBuffer bb= new BoundedBuffer();
		int count = 10;
		
		CountDownLatch l = new CountDownLatch(count*2);
		
		System.out.println(new Date() + " now try to call put for " + count );
		for(int i=0;i<count;++i){
			final int index = i;
			Thread t = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						bb.put(index);
						System.out.println(new Date() + "  put finished:  " + index);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}  
					l.countDown();
				}
			});
			t.start();
		}
		try {  
            System.out.println(new Date() + " main thread is going to sleep for 10 seconds");  
            Thread.sleep(10 * 1000); 
        } catch (InterruptedException e1) {  
            e1.printStackTrace();  
        }
		
		System.out.println(new Date() + " now try to call take for " + count );
		for(int j = 0;j<count;++j){
			final int index = j;
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Object x = bb.take();
						System.out.println(new Date() + " take get: " + x);  
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					l.countDown();
				}
			});
			thread.start();
		}
		
		try {
			System.out.println(new Date() + ": main thread is to wait for all threads"); 
			l.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(new Date() + " all threads finished");
	}
}
