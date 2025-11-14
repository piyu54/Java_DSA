package com.examples;

import java.util.Scanner;

public class Areaofcircle {
	public static void main(String[] args) {
		//scanner is used to take an input from user
		Scanner sr = new Scanner(System.in);
		System.out.println("enter your radius");
		float radius = sr.nextFloat();
		float area = 3.14f * radius * radius;
		System.out.println("Area of the circle is " + area);
		sr.close();
	}
}
