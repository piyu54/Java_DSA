package com.operators;

public class AssignmentQuestions {

	public static void main(String[] args) {

		// first
		int x = 200, y = 50, z = 100;
		if (x > y && y > z) {
			System.out.println("Hello");
		}
		if (z > y && z < x) {
			System.out.println("Java");
		}
		if ((y + 200) < x && (y + 150) < z) {
			System.out.println("Hello Java");
		}

		// second
		int x2 = 2, y2 = 5;
		int exp1 = (x2 * y2 / x2);
		int exp2 = (x2 * (y2 / x2));
		System.out.println(exp1 + ",");
		System.out.println(exp2);

		// third
		int x3, y3, z3;
		x3 = y3 = z3 = 2;
		x3 += y3;
		y3 -= z3;
		z3 /= (x3 + y3);
		System.out.println(x3 + " " + y3 + " " + z3);

		// four
		int x4 = 9, y4 = 12;
		int a = 2, b = 4, c = 6;
		int exp = 4 / 3 * (x4 + 34) + 9 * (a + b * c) + (3 + y4 * (2 + a)) / (a + b * y4);
		System.out.println(exp);

		// fifth
		int x5 = 10, y5 = 5;
		int exp4 = (y5 * (x5 / y5 + x5 / y5));
		int exp5 = (y5 * x5 / y5 + y5 * x5 / y5);
		System.out.println(exp4);
		System.out.println(exp5);
	}

}
