package com.zhangql.thread.waitAndNotify;

public class Waiter implements Runnable{
	
	private Message msg;
	
	
	public Waiter(Message msg) {
		this.msg = msg;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
				try {
					System.out.println(name+" waiting to get notifed at time "+System.currentTimeMillis());
					msg.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
	            //process the message now
	            System.out.println(name+" processed: "+msg.getMsg());
		}
	}
	
}
