package com.JavaSessions;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {
	    System.out.println("Enter an Integer number:");
	    Scanner sc = new Scanner(System.in);
	  int  num = sc.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("The Number you've entered is even");
	     else
	        System.out.println("The Number you've entered is odd");
	    sc.close();
	  }
}
