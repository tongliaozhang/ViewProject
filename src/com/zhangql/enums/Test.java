package com.zhangql.enums;

public class Test {
	public static void main(String[] args){
		TcdEnum consume = TcdEnum.parse("10110001");
		System.out.println(consume.getKey()+"---"+consume.getValue());
	}
}
