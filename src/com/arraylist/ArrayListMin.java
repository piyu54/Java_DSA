package com.arraylist;

import java.util.ArrayList;
//min number
public class ArrayListMin {

	public static void main(String[] args) {

		
		ArrayList< Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		int min=l.get(0);
		//System.out.println(l.get(0));
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)<min)
			{
				min=l.get(i);
			}
		}
		System.out.println(min);

	}

}
