package com.zhangql.pattern.proxy;

public class ProxyObject implements MyObject{
	private MyObject object;
	
	public ProxyObject(MyObject  object) {
		this.object = object;
	}

	@Override
	public void doSomething() {
		object.doSomething();
	}

	@Override
	public void doOther() {
		//System.out.println("invoke "+object.getClass()+",method:"+object.getClass().getMethods());
		object.doOther();
	}
	
	public static void main(String[] args){
		RealObject  a = new RealObject();
		ProxyObject b = new ProxyObject(a);
		b.doSomething();
		b.doOther();
	}
}
