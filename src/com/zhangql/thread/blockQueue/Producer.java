package com.zhangql.thread.blockQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			Message msg = new Message(" "+i);
			try {
				//Thread.sleep(i);
				queue.put(msg);
				System.out.println("Producer "+msg.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Message exit = new Message("exit");
		try {
			queue.put(exit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
