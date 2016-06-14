package com.zhangql.concurrent.LockInterruptibly;

public class Interrupt implements Runnable{
	private TryLockInterrupt tryLockInterrupt;

	public Interrupt(TryLockInterrupt tryLockInterrupt) {
		this.tryLockInterrupt = tryLockInterrupt;
	}

	@Override
	public void run() {
		tryLockInterrupt.interrupt();
	}
	
	
	
	
}
