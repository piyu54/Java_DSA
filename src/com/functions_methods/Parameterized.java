package com.functions_methods;

import java.util.Scanner;

public class Parameterized {

	
	public static void sum(int first,int second)
	{

		int sum=first+second;
		
		System.out.println("sum is "+sum);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first num");
		int first=s.nextInt();
		
		System.out.println("enter second num");
		int second=s.nextInt();
		sum(first,second);
	}
}
