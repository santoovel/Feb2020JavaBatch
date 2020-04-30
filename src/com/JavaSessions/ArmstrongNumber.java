package com.JavaSessions;

public class ArmstrongNumber {

	//153 ====>1+125+27 = 153
	//407, 1, 0
	
	public static void isArmStrongNumber(int num) {
		
		System.out.println("Given number is: "+ num);
		int cube=0;
		int r;
		int t;
		
		t=num;
		while(num>0) {
			
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("This is Armstrong Number:");
		}
		else {
			System.out.println("This is not an Armstrong number:");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isArmStrongNumber(153);
		isArmStrongNumber(0);
		isArmStrongNumber(370);
		isArmStrongNumber(1531);
	}

}
