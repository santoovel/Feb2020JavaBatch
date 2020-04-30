package com.JavaSessions;

public class PalindromeNumber {
	
	public static void 	isPalindrome(int num)
	{
		System.out.println("Given number is : "+ num);
	// 151, 454 , 34543, 161, 78987
			int r = 0;
			int sum=0;
			int t;
			
			t=num;
			while(num>0) {
				r = num%10; // get the remainder
				sum = (sum*10)+r;
				num=num/10; 
				
			}
			if(t==sum) {
				System.out.println("Palindrome Number");
			}
			else {
				System.out.println("Not palindrome number");
			}
			
	}
	public static void main(String[] args) {
		

		isPalindrome(151);
		isPalindrome(454);
		isPalindrome(34543);
		isPalindrome(0);
	}

}
