package com.loops;

import java.util.Scanner;

public class WhileUsingScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		int sum=0;
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
