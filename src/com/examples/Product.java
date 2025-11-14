package com.examples;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("enter your first number");
		int a = sr.nextInt();
		System.out.println("enter your second number");
		int b = sr.nextInt();
		System.out.print("multi of two number");
		int product = a * b;
		System.out.println(product);
		sr.close();

	}
}
