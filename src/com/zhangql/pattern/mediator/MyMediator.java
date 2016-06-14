package com.zhangql.pattern.mediator;

public class MyMediator implements Mediator{

	private UserA userA;
	private UserB userB;
	
	
	public UserA getUserA() {
		return userA;
	}

	public void setUserA(UserA userA) {
		this.userA = userA;
	}

	public UserB getUserB() {
		return userB;
	}

	public void setUserB(UserB userB) {
		this.userB = userB;
	}

	@Override
	public void createMediator() {
		userA = new UserA(this);
		userB = new UserB(this);
	}

	@Override
	public void workAll() {
		userA.work();
		userB.work();
	}

}
