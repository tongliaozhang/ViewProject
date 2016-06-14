package com.zhangql.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {
	public static void main(String[] args) throws InterruptedException{
		RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandlerImpl();
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2	, 4, 10, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(2),threadFactory,rejectedExecutionHandler);
		MonitorThread monitor = new MonitorThread(executorPool, 2);
		Thread monitorThread = new Thread(monitor);
		monitorThread.start();
		
		for(int i=0; i<10; i++){
            executorPool.execute(new WorkThread("cmd"+i));
        }
		Thread.sleep(30000);
        //shut down the pool
        executorPool.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();
		
		
		
	}
}
