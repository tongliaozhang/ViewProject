package com.zhangql.sort;

public class PoPoSort {
      public static void main(String[] args){
    	  Integer[] abc = {1,3,2,8,5,4,9,7,10};
    	  
    	  Sorter sorter = new BubbleSorter();
    	  sorter.sort(abc);
    	  for(Integer i:abc){
    		  System.out.println(i);
    	  }
      }
}
