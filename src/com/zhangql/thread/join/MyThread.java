package com.zhangql.thread.join;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
        	//System.out.println("Thread sleep 4 second ");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
		
	}

}
