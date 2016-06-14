package com.zhangql;

import java.util.Comparator;

public class Search {
	public static <T extends Comparable<T>> int binarySearch(T[] x,T key){
		return binarySearch(x, 0,x.length-1,key);
	}
	
	public static <T>  int binarySearch(T[] x,T key,Comparator<T> comp){
		int low = 0;
		int high = x.length-1;
		while (low<=high) {
			int mid = (low+high)>>>1;
			int cmp = comp.compare(x[mid], key);
			if(cmp<0){
				low = mid+1;
			}else if(cmp>0){
				high = mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] x,int low,int high,T key){
		while (low<=high) {
			int mid = (low+high)>>>1;
			int cmp = x[mid].compareTo(key);
			if(cmp<0){
				low = mid+1;
			}else if(cmp>0){
				high = mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Integer[]  s = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int key = 11;
		System.out.println(binarySearch(s, key));
	}
}
