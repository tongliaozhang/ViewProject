package com.zhangql.thread.pool;

public class WorkThread implements Runnable{

	private String command;
	
	
	public WorkThread(String command) {
		this.command = command;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  Strat. command = "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+"  End. ");
	}
	
	private void processCommand(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return this.command;
	}

}
