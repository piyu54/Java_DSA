package com.conditionalstatement;

public class Switch {
	public static void main(String[] args) {

		String month = "jan";

		switch (month) {
		case "jan":
			System.out.println("this is an jan");
			break;
		case "feb":
			System.out.println("this is an feb");
		default:
			System.out.println("this is an march");
			break;
		}

	}
}
