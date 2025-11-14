package com.examples;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
//multiplication using scanner
		Scanner sr = new Scanner(System.in);
		System.out.println("enter your first number");//first num
		int a = sr.nextInt();
		System.out.println("enter your second number");//second num
		int b = sr.nextInt();
		System.out.print("multi of two number "); //operation
		int product = a * b;
		System.out.println(product);
		sr.close();

	}
}
