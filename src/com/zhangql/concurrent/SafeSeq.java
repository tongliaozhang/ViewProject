package com.zhangql.concurrent;

import java.util.concurrent.atomic.AtomicLong;

public class SafeSeq{  
    private AtomicLong count  = new AtomicLong(0);  
	  
    public void inc()  
    {  
        count.incrementAndGet();  
    }  
  
    public long get()  
    {  
        return count.longValue();  
    }  
}
