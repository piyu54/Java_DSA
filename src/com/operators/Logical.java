package com.operators;

public class Logical {

	public static void main(String[] args) {
		/*logical operators 
		 * AND T T = T
		 * 	   T F = F
		 * 	   F T = F
		 *     F F = F
		 *  OR T T = T
		 * 	   T F = T
		 * 	   F T = T
		 *     F F = F
		 *     
		 *  NOT
		 *  F=T
		 *  T=F
		 * 	*/
		
		int a = 16;
		int b = 15;
		System.out.println((a > b && b < a));
		System.out.println(a < b || a <= b);

	}

}
