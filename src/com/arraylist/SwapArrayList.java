package com.arraylist;

import java.util.ArrayList;
//swapping an array
public class SwapArrayList {

	
	public static void swap(ArrayList< Integer> l,int index1,int index2)
	{
		int temp=l.get(index1);
		l.set(index1,l.get(index2));
		l.set(index2,temp);
	}
	public static void main(String[] args) {
		
		ArrayList< Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		
		
		
		int index1=0;
		int index2=1;
		//before
		System.out.println(l);
		swap(l, index1, index2);
		//after
		System.out.println(l);
		
		

	}
}
