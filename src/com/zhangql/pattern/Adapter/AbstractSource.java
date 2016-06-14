package com.zhangql.pattern.Adapter;

public abstract class AbstractSource implements Sourceable{
	/**
	 * 抽象类方法
	 */
	 public void methodA(){
		 System.out.println("AbstractSource.methodA");
	 }
	 /**
		 * 抽象类方法
		 */
	 public void methodB(){
		 System.out.println("AbstractSource.methodB");
	 }
	 /**
		 * 抽象类方法
		 */
	 public void methodC(){
		 System.out.println("AbstractSource.methodC");
	 }
}
