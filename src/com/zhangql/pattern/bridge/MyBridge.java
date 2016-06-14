package com.zhangql.pattern.bridge;

public class MyBridge extends Bridge {
	public void  method() {
		getSource().method();
	}
}
