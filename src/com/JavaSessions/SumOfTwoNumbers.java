package com.JavaSessions;

import java.util.Scanner;

//Methods in Java:
//1.Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumOfTwoNumbers {
	public static int AddTwoNumbers(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		num2 = sc.nextInt();
		sum=AddTwoNumbers(num1,num2);
		System.out.println("Sum of two numbers are : "+ sum);
		sc.close();
		
		System.out.println("Sum of two numbers: "+ sum(100,200));
	}



public static int sum(int a, int b) {
	System.out.println("\n========");
	System.out.println("SUM method :======");
	int z = a + b;//
	return z;
}

}