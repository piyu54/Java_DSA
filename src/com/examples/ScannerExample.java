package com.examples;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) 
    {
		//here its display an syso line 
		System.out.println("enter an name");
		/*here Creates a Scanner object named s.
		Scanner is used to read input from the keyboard*/
		Scanner s = new Scanner(System.in);
		//here nextLine is read an entire line of text
        String name =s.nextLine();
        System.out.println("Your name is "+name);
        s.close();
    }
}
