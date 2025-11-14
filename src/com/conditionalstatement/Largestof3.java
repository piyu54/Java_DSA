package com.conditionalstatement;

public class Largestof3 {
	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		int c = 1;

		if (a > b && a > c) {
			System.out.println("a is largest");

		} else if (b > a && b > c) {
			System.out.println("b is largest");
		} else {
			System.out.println("c is largest");
		}
	}
}
