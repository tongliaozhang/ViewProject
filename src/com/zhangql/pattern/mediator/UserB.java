package com.zhangql.pattern.mediator;

public class UserB extends User{

	
	public UserB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("UserB is exe!");
	}

}
