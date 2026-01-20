package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList< Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(10);
		l.add(30);
		l.add(40);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
	}
}
