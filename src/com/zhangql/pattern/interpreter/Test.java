package com.zhangql.pattern.interpreter;

public class Test {
	public static void main(String[] args){
		Context  context = new Context(100, 200);
		//Expression expression = new Plus();
		Expression expression = new Minus();
		int result = expression.interpret(context);
		System.out.println(result);
	}
}
