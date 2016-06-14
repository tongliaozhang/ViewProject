package com.zhangql.pattern.singleton;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton);
		}
	}
}
