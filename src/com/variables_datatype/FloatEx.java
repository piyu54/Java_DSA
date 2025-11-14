package com.variables_datatype;

import java.util.Scanner;

public class FloatEx {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
	     
		System.out.println("enter an pencil price");//pencil price
        float pencil=sr.nextFloat();
        System.out.println("enter an pen price");//pen price
        float pen=sr.nextFloat();
        System.out.println("enter an eraser price");//eraser price
        float eraser=sr.nextFloat();
        
        float bill=pencil+pen+eraser;
        float newtotal=bill+(0.18f*bill);

        System.out.println("your bill an "+newtotal);
        sr.close();
	}

}
