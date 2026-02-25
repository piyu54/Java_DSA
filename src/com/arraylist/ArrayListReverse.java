package com.arraylist;
import java.util.ArrayList;
public class ArrayListReverse {
//reverse an array
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}
	
}
