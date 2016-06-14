package com.zhangql.pattern.visitor;

public class Test {
	public static void main(String[] args){
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
		
		Subject subject2 = new YouSubject();
		subject2.accept(visitor);
		
		
	}
}
