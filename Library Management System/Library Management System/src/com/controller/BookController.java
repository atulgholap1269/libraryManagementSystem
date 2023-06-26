package com.controller;

import java.util.Scanner;

import com.service.Book;
import com.service.BookManagement;
import com.service.NotFoundException1;
import com.serviceImplementation.LibraryMangementImplementation;

public class BookController {
	Scanner sc = new Scanner(System.in);
	Book b=new Book();
    private BookManagement manage;
    public BookController()
    {
    	this.manage= new LibraryMangementImplementation();
    }
    
    public void performOpearation(int option)
    {
    	switch(option)
    	{
    	case 1: 
    		manage.addBook(b);
    	break;
    	case 2:
    		System.out.println("Enter id of book that you to want to remove");    		
    	    int bid=sc.nextInt();
    	    try
    	    {
    	    manage.removeBook(bid);
    	    }
    	    catch(NotFoundException1 e)
    	    {
    	    	System.out.println("Enter Id is not present in the system\nPlease enter correct Id");
    	    }
    	    break;
    	case 3:
    		System.out.println("Enter title of book that you to want to search");    		
    	    String title1=sc.next();
    	    try
    	    {
    	     manage.searchTitle(title1);
    	    }
    	    catch(NotFoundException1 e)
    	    {
    	    	
            System.out.println("Enter Title book is not present in the system");
    	    }
    	    break;
    	case 4:
    		
    	    try
    	    {
    	    System.out.println("Enter Author of book that you to want to search");    		
        	String Author1=sc.next();
    	    manage.searchByAuthor(Author1);
    	    }
    	    catch(NotFoundException1 e)
    	    {
    	    	System.out.println("Enter Author book is not present in the system");
    	    }
    	    break;
    	case 5:
    		try {
    	    manage.displayAllBooks();
    		}
    		catch(NotFoundException1 e)
    	    {
    	    	System.out.println("Enter Author book is not present in the system");
    	    }
    		break;
    	case 6:
    		try {
    		System.out.println("Enter genre of book that you to want to display");    		
    	    String genre=sc.next();
    	    manage.displayBooksByGenere(genre);
    		}
    		catch(NotFoundException1 e)
    	    {
    	    	System.out.println("Enter Author book is not present in the system");
    	    }
    	    break;
    	default:
    		System.out.println("Invalid choice. Please try again");
	        break;
    	}
    	
    }
    
}
