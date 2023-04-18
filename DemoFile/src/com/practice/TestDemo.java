package com.practice;

import java.util.Scanner;

public class TestDemo {

	  public static void getString(String str) {
		  
		String reverse = "";
		String a = str ;
		
		for(int i = str.length()-1 ; i>=0 ;i-- ) {
			
			  reverse = reverse + str.charAt(i);
			
		}
		  
		if(a.equals(reverse)) {
			
			System.out.println(" String is palindrome");

			
		}else {
			
			System.out.println(" String is not palindrome");

		}
	  }
	
	  public static void main(String[] args) {
		
		  System.out.println("Enter String >> ");
		  Scanner scanner =  new Scanner(System.in);
		  String s = scanner.next();
		  
		  getString(s);
		  
		  
		  
	}
	
	
	
	
	
	
	
}
