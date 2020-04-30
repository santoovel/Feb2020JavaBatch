package com.JavaSessions;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<num ; i++ ) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumbers(int num){
		for(int i=2; i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i +  " ");
			}
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("0 is prime number: "+ isPrimeNumber(0));
		System.out.println("1 is prime number: "+ isPrimeNumber(1));
		System.out.println("2 is prime number: "+ isPrimeNumber(2));
		System.out.println("3 is prime number: "+ isPrimeNumber(3));
		System.out.println("-7 is prime number: "+ isPrimeNumber(-7));
		
		getPrimeNumbers(8);
		getPrimeNumbers(9);
		getPrimeNumbers(20);

	}

}
