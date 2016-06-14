package com.zhangql.pattern.chain;

public class Test {
	public static void main(String[] args){
		MyHandler a = new MyHandler("A");
		MyHandler b = new MyHandler("B");
		MyHandler c  = new MyHandler("C");
		
		a.setHandler(b);
		b.setHandler(c);
		
		a.operation();
	}
}
