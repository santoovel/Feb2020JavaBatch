package com.JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistEx1 {

	public static void main(String[] args) {
		
		
		//ArrayList - default class in java
				//dynamic array 
				//create the object of ArrayList class
				
				ArrayList ar = new ArrayList();
				System.out.println(ar.size());//0
				ar.add(100);//0
				ar.add(200);//1
				System.out.println(ar.size());
				ar.add(300);//2
				ar.add(400);//3
				System.out.println(ar.size());
				//to print all the values of arraylist: for loop:
				for(int i=0; i<ar.size(); i++){
					System.out.println(ar.get(i));
				}
				
				// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection

				ArrayList<String> color= new ArrayList<String>(); {
					color.add("Green");
					color.add("Yellow");
					color.add("Blue");
					color.add("Orange");
					System.out.println(color);
				//	for(int i1=0;i1<color.size();i1++) {
					//	System.out.println(color.get(i1));
					//}	
				}
				//2.Write a Java program to insert an element into the array list at the first and last positions
				color.add(0, "Pink");
				color.add(5,"Black");
				System.out.println(color);
				//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
				String s1=color.get(0);
				System.out.println(s1);
				String s2=color.get(4);
				System.out.println(s2);
			//	4. Write a Java program to update specific array element by given element.
				color.set(2, "White");
				System.out.println(color);
			//	5. Write a Java program to remove the third element from a array list. 
				color.remove(4);
				System.out.println(color);
			//	6. Write a Java program to search an element in a array list.
				 if (color.contains("White")) {
					    System.out.println("Found color "+ color);
					    } else {
					    System.out.println("color not found"+color);
					    }
				// 7. Write a Java program to reverse elements in a array list
	              System.out.println("List before reversing :\n" + color);  
	              Collections.reverse(color);
	              System.out.println("List after reversing :\n" + color);
	           //   8. Write a Java program to extract a portion of a array list.
	              List<String> sub_List = color.subList(0, 2);
	              System.out.println("List of first three elements: " + sub_List);
	             // 9. Write a Java program of swap two elements in an array list.
	              Collections.swap(color, 0, 2);
	              System.out.println("Array list after swapping:");
	              System.out.println( color);
	           
	             // 11. Write a Java program to trim the virtual capacity of an array list the current list size.
	              System.out.println("Original array list: " + color);
	              color.trimToSize();
	              System.out.println(color);
	              System.out.println(  color);
	              
	              int no_of_elements = color.size();
	              for (int index = 0; index < no_of_elements; index++)
	              {
	               System.out.println(color.get(index));
	             }
	              
	              //  10. Write a Java program to empty an array list.
	              color.removeAll(color);
	              System.out.println( "Array list after removing all elements"+color);
	}
	

}
