package com.zhangql.concurrent.LockNew;

public class Put implements Runnable{
	private TryLockDemo tryLock;
	
	public Put(TryLockDemo tryLock) {
		this.tryLock = tryLock;
	}

	@Override
	public void run() {
		while (true) {
			try {
				tryLock.put();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
}
