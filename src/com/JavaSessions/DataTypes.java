package com.JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//1) primitive data types
		// a) boolean:true / false
		// b) Numeric Type: IntegerFamily
		
		// Integer : byte short int long
		//FLoating: float double
		
		// 2) Non Primitive Data types: String Array
		
		// byte
		//size: 1 byte = 8 bits
		//Range: -128 to 127
		
		byte b = 10;
		b=20;
		byte b1 =0;
		byte b2=-1;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		//2. short
		// size: 15 bits = 2 bytes
		//Range: -32768 to 32767
		
		short sh = 100;
		short sh1 = -90;
		System.out.println(sh+sh1);
		
		// 3. int:
		//size: 32 bits = 4 bytes
		//range: -2,147,483,648 to 2,147,483, 647
		int i = 1000;
		int k = -900;
		int l = 0;
		System.out.println(i+k*l);
		System.out.println((i+k)*l);
		
		//4 long
		// 64 bits: = 8 bytes
		long l1 = 100000;
		System.out.println(l1);
		
		//5 float
		//size: 32 bits = 4 bytes
		//Range: up to 7 decimals
		
		float f1= 12.33f;
		float f2= (float)13.33;
		System.out.println(f1);
		System.out.println(f2);
		
		float f3 = 100;
		System.out.println(f3);
		
		//double: 64 bits: 8 bytes
		// up to 15 decimal digits
		double d1 = 12.33;
		System.out.println(f1+d1);
		

		//boolean: true or flase
		//size: 1 bit
		
		boolean flag= true;
		System.out.println(flag);
		
		//String
		
		String str = "Selenium";
		System.out.println(str);
		
		String str1 = "1000";
		System.out.println(str1+20);
		
		String str2 = "hey this is my first java code";
		System.out.println(str+" "+str2);
		
		//char: size 16 bits = 2 bytes
		char c1 = 'A';
		System.out.println(c1);
		
		char c2='a';
		char c3='b';
		System.out.println(c2+c3);
		//a-z 97 to 122
		//A-z 65 to 90
		//0-9 48 to 57
		
		
		
		
		
		
		
		
		
		
	}

}
