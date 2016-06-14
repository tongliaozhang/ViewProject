package com.zhangql.pattern.strategy;

public class AbstractCalculate {
	public int[] split(String exp,String opt){
		String array[] = exp.split(opt);
		int arryInt[] = new int[2];
		arryInt[0] = Integer.parseInt(array[0]);
		arryInt[1] = Integer.parseInt(array[1]);
		return arryInt;
	}
}
