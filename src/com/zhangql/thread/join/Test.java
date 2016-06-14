package com.zhangql.thread.join;

public class Test {
	public static void main(String[] args){
		Thread t1 = new Thread(new MyThread(),"T1");
		Thread t2 = new Thread(new MyThread(),"T2");
		Thread t3 = new Thread(new MyThread(),"T3");
		
		t1.start();
		
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		t2.start();
		
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All threads are dead, exiting main thread");
	}
}
