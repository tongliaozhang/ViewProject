package com.zhangql.pattern.iterator;

public interface Iterator {
	//前移
	public Object previous();
	
	//后移
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}
