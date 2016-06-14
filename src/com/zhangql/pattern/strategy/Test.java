package com.zhangql.pattern.strategy;

public class Test {
	public static void main(String[] args){
		String exp = "12+100";
		ICalculate calculate = new Plus();
		int result = calculate.calculate(exp);
		System.out.println("Exp=" + exp+"，result = "+result);
		
		exp = "100-120";
		calculate = new Minus();
		result = calculate.calculate(exp);
		System.out.println("Exp=" + exp+"，result = "+result);
		
		exp = "100*12";
		calculate = new Multiply();
		result = calculate.calculate(exp);
		System.out.println("Exp=" + exp+"，result = "+result);
		
		
	}
}
