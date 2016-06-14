package com.zhangql.pattern.strategy;

public class Plus extends AbstractCalculate implements ICalculate{

	@Override
	public int calculate(String exp) {
		int arryint[] = split(exp, "\\+");
		return arryint[0]+arryint[1];
	}

}
