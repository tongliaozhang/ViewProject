package com.zhangql.pattern.templateMethod;

public class Minus extends AbstractCalculator {

	@Override
	public int calculator(int num1, int num2) {
		return num1 - num2;
	}

}
