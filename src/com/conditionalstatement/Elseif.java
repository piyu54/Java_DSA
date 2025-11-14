package com.conditionalstatement;

public class Elseif {
	public static void main(String[] args) {

		int age = 14;

		if (age >= 18) {
			System.out.println("you can vote");
		} else if (age >= 13 && age < 18) {
			System.out.println("you are teenager");
		} else {
			System.out.println("you are a child");
		}
	}
}
