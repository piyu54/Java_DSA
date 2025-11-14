package com.examples;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// scanner used to take an input
		Scanner sr = new Scanner(System.in);
		System.out.println("enter your first number");// first num
		int num = sr.nextInt();
		System.out.println("enter your second number");// second num
		int num2 = sr.nextInt();
		System.out.println("enter your sign +,-,*,/,% ");// you can enter an operation sign
		char operator = sr.next().charAt(0);// this is used first character of that string.
		switch (operator) {
		case '+':
			System.out.println("addition of two num is " + (num + num2));

			break;
		case '-':
			System.out.println("SUB of two num " + (num - num2));

			break;
		case '*':
			System.out.println("MULTI of two num " + (num * num2));

			break;
		case '/':
			System.out.println("DIVISION of two num " + (num / num2));

			break;
		case '%':
			System.out.println("MODULOR of two num " + (num % num2));

			break;
		default:
			System.out.println("you Put the incorrect input");
			break;
		}
		sr.close();
	}

}
