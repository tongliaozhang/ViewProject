package com.zhangql.concurrent.LockInterruptibly;

public class Test {
	public static void main(String[] args){
		TryLockInterrupt tryLockInterrupt = new TryLockInterrupt();
		Thread test = new Thread(new Interrupt(tryLockInterrupt));
		test.start();
	}
}
