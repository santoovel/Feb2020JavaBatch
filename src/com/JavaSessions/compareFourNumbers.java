package com.JavaSessions;

public class compareFourNumbers {

	public static void main(String[] args) {
		int a=400;
		int b = 500;
		int c = 10000;
		int d = 900;
		
		if(a>b && a>c && a>d) {
			System.out.println("A is highest ");
		}
		else if (b>a && b>c && b>d) {
			System.out.println("B is highest");
		}
		else if(c>a && c>b && c>d) {
			System.out.println("C is highest");
		}
		else if (d>a && d>b && d>c) {
			System.out.println("D is highest");
	}
		
	}

}
