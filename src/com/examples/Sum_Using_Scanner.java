package com.examples;

import java.util.Scanner;

public class Sum_Using_Scanner {
	//same as multiplication
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = s.nextInt();
		System.out.println("enter the second number");
		int b = s.nextInt();

		int sum = a + b;
		System.out.println("Sum of two numbers " + sum);
		s.close();
	}
}
