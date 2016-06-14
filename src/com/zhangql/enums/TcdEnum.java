package com.zhangql.enums;

import java.util.EnumSet;

public enum TcdEnum {
	
	Consume("10110001","消费"){
		@Override
		public void method() {
			System.out.println("消费方法");
		}
	},Cancel("10110002","撤销"){

		@Override
		public void method() {
			System.out.println("撤销方法");
		}
	};
	

	private String key;
	private String value;
	
	private TcdEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public abstract  void method();
	
	public static TcdEnum parse(String tcd){
		return TcdEnum.valueOf(tcd);
	}
}
