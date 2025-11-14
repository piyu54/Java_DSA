package com.variables_datatype;

import java.util.Scanner;

public class SideOfSq {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("enter the side");
		int side = sr.nextInt();
		int area = side * side;
		System.out.println("The side of area is "+area);
		sr.close();
	}
}
