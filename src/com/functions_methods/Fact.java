package com.functions_methods;

public class Fact {

	public static int fact(int num)
	{
		int fact=1;
		
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {

		System.out.println("fact is "+fact(5));
	}
}
