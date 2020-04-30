package com.JavaSessions;

import java.util.Scanner;

//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user
public class MaxMinOfThreeNumbers {
	public static double max(double a, double b, double c)
	{
		if(a>b && a>c ) {
			return a;
		}
		else if(b>c ) {
			return b;
		}
		else 
			return c;
	}
	public static double min(double a, double b, double c)
	{
		if(a<b && a<c ) {
			return a;
		}
		else if(b<c ) {
			return b;
		}
		else 
			return c;
	}
	public static void main(String[] args) {
		
		double x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
		System.out.println("Maximum number is : " + max(x,y,z));
		System.out.println("Minimum number is : " + min(x,y,z));
		s.close();
		
	}

}
