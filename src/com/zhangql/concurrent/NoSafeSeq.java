package com.zhangql.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class NoSafeSeq{  
    private long count = 0;
    
    private ReentrantLock lock = new ReentrantLock();
    public void inc()  
    {  
    	lock.lock();
        try {
			count++;
		} catch (Exception e) {
			e.printStackTrace();
		}  finally{
			lock.unlock();
		}
    }  
  
    public long  get()  
    {  
        return count;  
    }  
}
