package com.zhangql.pattern.singleton;

/**
 * 适用静态内部类方式创建单例对象
 * @author zhangql
 *
 */
public class Singleton {
	
	private Singleton(){
		
	}
	
	public static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readResolve() {  
        return getInstance();  
    }  
}
