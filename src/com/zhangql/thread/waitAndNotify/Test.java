package com.zhangql.thread.waitAndNotify;

public class Test {
	public static void main(String[] args){
		Message msg = new Message("process it");
		Waiter waiter = new Waiter(msg);
		new Thread(waiter,"waiter").start();
		
		Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notifier notifier = new Notifier(msg);
        Thread a= new Thread(notifier,"notifier");
        Thread b= new Thread(notifier,"notifier2");
        try {
			a.start();
			b.start();
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("All the threads are started");
	}
}
