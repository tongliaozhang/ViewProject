package com.zhangql.pattern.Adapter;

/**
 * 类适配器模式
 * 通过继承和实现接口来适配
 * @author zhangql
 *
 */
public class AdapterForClass extends Source implements Targetable{

	@Override
	public void method_target() {
		System.out.println("this is the targetable method!");  
	}

}
