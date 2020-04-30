package com.JavaSessions;

public class Factorial {
//fact of 3 = 3*2*1
	// fact of 4= 4*3*2*1
	//1=1
	//fact(0)=1
	//1. without recursive -- use for loop
	
	public static int factorial(int num) {
		int fact=1;
		
		if(num==0) {
			return 1;
		}
		for(int i=1; i<=num; i++) {
			fact=fact*i; // 1*2*3*4
		}
		return fact;
			
		}
	
	// recursive:
	
	public static int facto(int num) {
		
		if(num==0)
		return 1;
		else
			return (num*facto(num-1));
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		
		
		System.out.println(facto(5));
		System.out.println(facto(1));
		System.out.println(facto(1));
	}

}
