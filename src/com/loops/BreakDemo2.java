package com.loops;

import java.util.Scanner;

public class BreakDemo2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Enter a num");
			int num = s.nextInt();

			if (num % 10 == 0) {
				break;
			}
			System.out.println(num);
		} while (true);
	}
}
