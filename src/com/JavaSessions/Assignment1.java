package com.JavaSessions;

public class Assignment1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name
		 * on a separate line. Expected Output : Hello Naveen K
		 */
		System.out.println("Hello");
		System.out.println("Naveen K");
		
		/*2. Write a Java program to print the sum of two numbers. 
		Test Data: 
		74 + 36 
		Expected Output :
		110*/
		int a= 74;
		int b = 36;
		
		System.out.println(a+b);
		
		

		/*
		 * 3. Write a Java program to divide two numbers and print on the screen. Test
		 * Data : 50/3 Expected Output : 16
		 */
		int a1=50;
		int b1=3;
		int c1=a1/b1;
		System.out.println("value of C1 is : "+ c1);
		
		/*	
		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
		Test Data:
		a. -5 + 8 * 6
		b. (55+9) % 9 
		c. 20 + -3*5 / 8 
		d. 5 + 15 / 3 * 2 - 8 % 3 
		Expected Output :
		43 
		1 
		19 
		13
		
		
		*/
		
		System.out.println(-5+(8*6));
		System.out.println((55+9) % 9 );
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		
		int p=1;
		int q=++p;
		System.out.println(p);
		System.out.println(q);
		
		
		for(;;) { //infinite loop
			System.out.println("bye");
		}
		
		
		
	}

}
