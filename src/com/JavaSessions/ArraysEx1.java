package com.JavaSessions;

public class ArraysEx1 {

	public static void main(String[] args) {
		
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[1]);
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		
		int p[]=new int[10];
		p[0]=100;
		p[1]=200;
		p[9]=500;
		System.out.println(p[9]);
		
		boolean b[]=new boolean[2];
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		String str[]=new String[4];
		str[0]="Java";
		str[1]="python";
		str[2]="Ruby";
		System.out.println(str[1]);
		for(int z=0;z<str.length;z++) {
			System.out.println(str[z]);
		}
		
		//Object Array: 
				Object ob[] = new Object[5];
				ob[0] = "Steve";
				ob[1]= 25;
				ob[2] = 12.33;
				ob[3] = true;
				ob[4] = 'm';
				
				for(int v=0; v < ob.length; v++){
					System.out.println(ob[v]);
				}
				
				
				System.out.println("\n============....===========");
	
				
			//	Java  program to print numbers from 001 to 100
		/*
		 * for(int i1 = 1; i1 <= 100; i1++) { String formatted = String.format("%03d",
		 * i1); System.out.println(formatted); }
		 */
				
				
				
				
				
				
				
			//	Array Assignment:
				//	Question 1: Write a program to print the following pattern using for loop:			
				 
		String f1[]=new String[40];
		for(int i2=0;i2<f1.length;i2++)
		{
			String formatted = String.format("%02d", i2);
			System.out.print(formatted+" ");
		}
		
		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name, age, team name, DOB, gender, Strike Rate --Try to
		 * create multiple Object Arrays for different players --Try to print all the
		 * values of each player on the console
		 */
		
		System.out.println("\n============Print Cricket data.....===========");
		Object cric[] = new Object[6];
		cric[0] = "Steve";
		cric[1]= 25;
		cric[2] = "India";
		cric[3] = "12-02-1990";
		cric[4] = 'm';
		cric[5]= "7.1";
				
		for(int l =0;l<cric.length;l++) {
			System.out.println(cric[l]);
		}
		
		/* Question 3: Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0
		*/
		
		System.out.println("\n============Print pattern.....===========");
		int pattern[]=new int[5];
		for(int p1=4; p1>=0 ; p1--) {
			System.out.println("n = "+p1);
		}
		
		
		
				
	}

}
