package com.zhangql.pattern.strategy;

public class Multiply extends AbstractCalculate implements ICalculate{

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0]*arrayInt[1];
	}

}
