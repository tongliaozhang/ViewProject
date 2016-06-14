package com.zhangql.pattern.memento;

public class Test {
	public static void main(String[] args){
		Original original = new Original("egg");
		Storage storage = new Storage(original.createMemento());
		 System.out.println("初始化状态为：" + original.getValue());  
		 original.setValue("niu");  
	     System.out.println("修改后的状态为：" + original.getValue());
	     
	     original.restoreMemento(storage.getMemento());  
	     System.out.println("恢复后的状态为：" + original.getValue()); 
	}
}
