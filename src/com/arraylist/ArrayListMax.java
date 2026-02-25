package com.arraylist;


import java.util.ArrayList;

public class ArrayListMax{
//max number
	public static void main(String[] args) {

		int max=0;
		ArrayList< Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)>max)
			{
				max=l.get(i);
			}
		}
		System.out.println(max);
	}
}
