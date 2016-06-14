package com.zhangql.pattern.bridge;

public class Test {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		Sourceable sourceA = new SourceSubA();
		bridge.setSource(sourceA);
		bridge.method();
		
		Sourceable sourceB = new SourceSubB();
		bridge.setSource(sourceB);
		bridge.method();
	}
}
