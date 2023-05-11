package Mphasis10;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String  reverseStr = "" ,str;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the String:");  
		  str = sc.next();
	    
	    
	    int strLength = str.length();

	    for (int i = (strLength-1); i >=0; i--) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    //if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	    if (str.toUpperCase().equals(reverseStr.toUpperCase())) {
	      System.out.println(str + " is Palindrome.");
	    }
	    		    
	    else if (str.matches("[@#$%^&*()]*[a-zA-Z]*")) {
	    	System.out.println("Invalid Input");	
	    }
	    
	    else if(str.matches("[a-zA-Z0-9]*  [A-Za-z0-9]*")) {
	    	System.out.println("Invalid Input");	
	    }
	    else {
		      System.out.println(str + " is not Palindrome.");
	    }
	    
	  }
	
	
	  
	
	


	}

