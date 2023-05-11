package Mphasis10;

import java.util.Scanner;

public class panCardValidation {

	public static void main(String[] args) {

		String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        s1=sc.next();
        if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
        
			
        {
            System.out.println("Valid PAN no");
        }

        else{
            System.out.println("Invalid PAN no");
        }
	}

}
