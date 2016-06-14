package com.zhangql.concurrent.LockNew;

public class Take implements Runnable {

	private TryLockDemo  tryLock;
	
	
	public Take(TryLockDemo tryLock) {
		this.tryLock = tryLock;
	}


	@Override
	public void run() {
		while(true){
			try {
				tryLock.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
