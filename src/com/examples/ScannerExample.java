package com.examples;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
        String name =s.nextLine();
        System.out.println(name);
        s.close();
    }
}
