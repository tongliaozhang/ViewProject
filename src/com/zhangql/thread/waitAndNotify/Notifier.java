package com.zhangql.thread.waitAndNotify;

public class Notifier implements Runnable{

	private Message msg;
	
	
	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" start...");
		try {
			Thread.sleep(5000);
			synchronized (msg) {
				System.out.println(name+" set...");
				msg.setMsg(name+" Notifier work done");
				System.out.println(name+" notify..");
				msg.notify();
				//msg.notifyAll();
				System.out.println(name+" notify end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
