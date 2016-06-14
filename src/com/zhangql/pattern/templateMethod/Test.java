package com.zhangql.pattern.templateMethod;

public class Test {
	public static void  main(String[] args) {
		String exp = "100-200";
		AbstractCalculator calculator = new Plus();
		//int result = calculator.calculator(exp, "\\+");
		//int result = calculator.calculator(100, 200);
		calculator = new Minus();
		int result = calculator.calculator(exp, "\\-");
		System.out.println(result);
	}
}
