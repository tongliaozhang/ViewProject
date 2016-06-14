package com.zhangql.pattern.strategy;

public class Minus extends AbstractCalculate implements ICalculate{

	@Override
	public int calculate(String exp) {
		int arryint[] = split(exp, "\\-");
		return arryint[0]-arryint[1];
	}

}
