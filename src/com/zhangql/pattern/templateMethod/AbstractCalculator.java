package com.zhangql.pattern.templateMethod;

import java.util.Spliterator;

public abstract class AbstractCalculator {
	public final int	 calculator(String exp,String opt) {
		int array[] = split(exp,opt);
		return calculator(array[0], array[1]);
	}
	
	/**抽象方法 供子类重写*/
	abstract public int calculator(int num1,int num2);
	
	public int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
