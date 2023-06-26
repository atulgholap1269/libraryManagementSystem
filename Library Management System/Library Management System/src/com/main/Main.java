package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.controller.BookController;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookController obj= new BookController();
		String option;
		try 
		{
		System.out.println("Welcome to library Management System");
		
		do
		{
			System.out.println("1.Add Book");
    		System.out.println("2.Remove Book");
    		System.out.println("3.Search By Title");
    		System.out.println("4.Search By Author");
    		System.out.println("5.Display All Book");
    		System.out.println("6.Display book by Genre");
    		
    		System.out.println("Enter choice");
    		int choice=sc.nextInt();
    		switch(choice)
    		{
    		case 1:
    			obj.performOpearation(choice);
    			break;
    		 case 2:
    	    	 obj.performOpearation(choice);
    	    	 break;
    	     case 3:
    	    	 obj.performOpearation(choice);
    	    	 break;
    	     case 4: 
    	    	 obj.performOpearation(choice);
    	    	 break;
    	     case 5:
       	    	 obj.performOpearation(choice);
    	    	 break;
    	     case 6:
    	    	 obj.performOpearation(choice);
    	    	 break;
    	     default:
    	    	 System.out.println("Invalid choice. Please try again");
    	    	 break;
    		}
    		System.out.println("Do you want to continue:\nEnter Yes or No");
       	    option =sc.next();
       	  }
		  while(option.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using our system...");
		}
		
       	catch(InputMismatchException e)
       	{
       		System.out.println("enter input not match with datatype of attribute");
       		return;
       	}
		sc.close();
	}
	
}
