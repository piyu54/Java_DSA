package com.conditionalstatement;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// first
//		Scanner sr = new Scanner(System.in);
//		System.out.println("enter your  number");
//		int a = sr.nextInt();
//
//		if (a < 0) {
//			System.out.println("this number is negative");
//		} else {
//			System.out.println("num is positive");
//		}
//		sr.close();
		
		
//		//second
//		double temp = 103.5;
//		if (temp >= 100) {
//			System.out.println("You have a Fever");
//		} else {
//			System.out.println("You dont have a fever");
//		}
		
		
		//third
//		Scanner sr2 = new Scanner(System.in);
//		System.out.println("enter your number");
//		int week = sr2.nextInt();
//
//		switch (week) {
//		case 1:
//			System.out.println("this is an 1 week");
//			break;
//		case 2:
//			System.out.println("this is an 2 week");
//		case 3:
//			System.out.println("this is an 3 week");
//			break;
//
//		case 4:
//			System.out.println("this is an 4 week");
//			break;
//		case 5:
//			System.out.println("this is an 5 week");
//			break;
//		case 6:
//			System.out.println("this is an 6 week");
//			break;
//		case 7:
//			System.out.println("this is an 7 week");
//			break;
//		default:
//			System.out.println("you input is invaild");
//			break;
//		}
//		sr2.close();
		
		
		
		//four
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = sc.nextInt();
		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		if (x && (y || z)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leapyear");
		}
		sc.close();

	}
}
