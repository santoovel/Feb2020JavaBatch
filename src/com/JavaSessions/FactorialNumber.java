package com.JavaSessions;

public class FactorialNumber {

	
	public static int factorial(int num){
		System.out.println("Given Number is : "+ num);
		int fact=1;
		if(num==0)
		return 1;
		
		for(int i=1; i<=num; i++){
			fact= fact*i; //
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(3));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
	}

}
