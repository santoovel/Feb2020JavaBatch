package com.JavaSessions;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class CircleAreaCircumference {
	public static double circleArea(double radius) {
		double area= Math.PI * radius *radius;
		return area;
	}
	public static double circleCircumference(double radius) {
	 double circumference= Math.PI * 2 * radius;
	 return circumference;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius to get circle area and circumference: ");
		double radius = sc.nextDouble();
		
		double area = circleArea(radius);
		System.out.println("Area of circle is: "+ area);
		
		double circumference= circleCircumference(radius);
		System.out.println("Circumference of circle is : "+ circumference);
		sc.close();
	}

}
