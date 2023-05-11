package Mphasis10;

import java.util.Scanner;

public class validNmae {

	public static void main(String[] args) {
		 String name;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Name:");
         name=sc.next();
         
         if(name.matches("[A-Za-z]*"))
         
			
         {
             System.out.println("Valid Name");
         }

         else{
             System.out.println("Invalid Name");

	
         }

	}

}
