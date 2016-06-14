package com.zhangql.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timer task finished at:"+new Date());
	}
	
	private void completeTask(){
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		TimerTask task = new MyTimerTask();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 0	, 10*1000);
		 System.out.println("TimerTask started");
		 try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		timer.cancel();
		System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
