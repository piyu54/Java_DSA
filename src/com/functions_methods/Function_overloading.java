package com.functions_methods;

public class Function_overloading {

	
	public static int sum(int a,int b)
	{
		
		return a+b;
	}
	
	public static float sum(float a,float b)
	{
		
		return a+b;
	}
	public static void main(String[] args) {
		
		System.out.println(sum(9.2f, 3.2f));
		System.out.println(sum(5, 2));
	}
}
