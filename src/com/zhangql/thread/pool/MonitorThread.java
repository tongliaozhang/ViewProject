package com.zhangql.thread.pool;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorThread implements Runnable{

	private ThreadPoolExecutor  executor;
	private int second;
	private boolean run = true;
	
	
	
	public MonitorThread(ThreadPoolExecutor threadPoolExecutor, int deley) {
		this.executor = threadPoolExecutor;
		this.second = deley;
	}

	public void shutdown(){
		this.run = false;
	}

	@Override
	public void run() {
		while(run){
			System.out.println(
                    String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                        this.executor.getPoolSize(),
                        this.executor.getCorePoolSize(),
                        this.executor.getActiveCount(),
                        this.executor.getCompletedTaskCount(),
                        this.executor.getTaskCount(),
                        this.executor.isShutdown(),
                        this.executor.isTerminated()));
			
			try {
                Thread.sleep(second*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
		
	}

}
