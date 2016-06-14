package com.zhangql.thread.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("*********************");
	}
}
