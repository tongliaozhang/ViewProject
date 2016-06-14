package com.zhangql.concurrent.condition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
	public static Lock lock = new ReentrantLock();
	public static Condition create = lock.newCondition();
	public static Condition remove = lock.newCondition();
	
	
	public static void main(String[] args){
		List list = new ArrayList(12);
		Product product = new Product(list, 10);
		Consumer consumer = new Consumer(list, 0);
		new Thread(product).start();
		new Thread(consumer).start();
	}
	
	
	static class Product implements Runnable{
		private List list;
		private int maxCount;
		
		public Product(List list, int maxCount) {
			this.list = list;
			this.maxCount = maxCount;
		}

		@Override
		public void run() {
			while(true){
				if(lock.tryLock()){
					try {
						if(getSize()>=maxCount){
							 System.out.println("容器已滿，product線程加入池中...");
							 create.await();
						}
						System.out.println("开始生产......");
						list.add(new Object());
						remove.signal();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally{
						lock.unlock();
					}
				}else{
					 System.out.println("未获取生产资格...");
				}
			}
			
		}
		
		public int getSize(){
			return list.size();
		}
	}
	
	static class Consumer implements Runnable{
		private List list;
		private int minCount;
		public Consumer(List list, int minCount) {
			super();
			this.list = list;
			this.minCount = minCount;
		}
		
		@Override
		public void run() {
			while(true){
				if(lock.tryLock()){
					try {
						if(getSize()<=minCount){
							System.out.println("容器已空，consumer线程加入池中.....");
							remove.await();
						}
						System.out.println("开始消费");
						list.remove(0);
						create.signal();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally{
						lock.unlock();
					}
				}else{
					System.out.println("未获得消费资格");
				}
			}
			
		}
		
		public int getSize() {  
            return list.size();  
        } 
	}
}
