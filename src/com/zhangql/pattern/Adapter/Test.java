package com.zhangql.pattern.Adapter;

public class Test {
	public static void  main(String[] args) {
		/*Targetable target = new AdapterForClass();
		target.method();
		target.method_target();
		
		Source source = new Source();
		Targetable targetMethod = new AdapterForMethod(source);
		targetMethod.method();
		targetMethod.method_target();*/
		
		Sourceable  sa = new AdapterForInterface();
		sa.methodA();
		sa.methodB();
		sa.methodC();
		
		Sourceable sb = new AdapterForInterfaceB();
		sb.methodA();
		sb.methodB();
		sb.methodC();
		
		
	}
}
