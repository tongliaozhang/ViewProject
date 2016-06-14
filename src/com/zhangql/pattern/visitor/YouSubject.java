package com.zhangql.pattern.visitor;

public class YouSubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "hate";
	}

}
