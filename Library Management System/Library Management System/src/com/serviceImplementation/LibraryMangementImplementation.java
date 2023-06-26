package com.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.service.Book;
import com.service.BookManagement;
import com.service.NotFoundException1;



public class LibraryMangementImplementation implements BookManagement {
    Scanner sc = new Scanner(System.in);
	ArrayList<Book> bl=new ArrayList<>();
	@Override
	public void addBook(Book book) {
		System.out.println("Enter number of book you want add");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter book id");
		int bid=sc.nextInt();
		System.out.println("Enter book title");
		String btitle=sc.next();
		System.out.println("Enter author name");
		String author=sc.next();
		System.out.println("Enter book genre");
		String genre=sc.next();
		System.out.println("Enter book year");
		int year=sc.nextInt();
		System.out.println("Enter book quantity");
		int quantity=sc.nextInt();
		book = new Book(bid,btitle,author,genre,year,quantity);
		bl.add(book);
		
		}
		
	}

	@Override
	public void removeBook(int id){
        
		if (bl.isEmpty()) 
		{
			throw new NotFoundException1("List is empty");
		}
		boolean isPresent=false;
		Iterator<Book> i=bl.iterator();
		while(i.hasNext())
		{
			  Book s1=i.next();
			  if(s1.getId()==id)
			  {
				  isPresent=true;
				
			  }
		}
		if(isPresent==true)
		{
			Iterator<Book> it=bl.iterator();
			Book s1=it.next();
			  if(s1.getId()==id)
			  {
				bl.remove(s1);
				System.out.println("Student remove from system");
				
			  }	
		}
		else
		{
			throw new NotFoundException1();
		}
			
	}
	
	@Override
	public void searchTitle(String title) {
		if (bl.isEmpty()) 
		{
			throw new NotFoundException1("List is empty");
		}
		boolean isPresent=false;
		System.out.println("bookId\t\tTitle\t\tAuthorname\tGenre\t\tYear\t\tQuantity");
		Iterator<Book>itr=bl.iterator();
		while(itr.hasNext())
		{
			  Book b=itr.next();
			  String c1=title.toLowerCase();
			  String c2=b.getTitle().toLowerCase();
			  int l=c1.length();
			  if(c2.substring(0,l/2).equals(c1.substring(0, l/2)))
			   {
				isPresent=true;
			   }
		}
		if(isPresent==true)	
		{
			  Iterator<Book>itr1=bl.iterator();
			  Book b=itr1.next();
			  String c1=title.toLowerCase();
			  String c2=b.getTitle().toLowerCase();
			  int l=c1.length();
			  if(c2.substring(0,l/2).equals(c1.substring(0, l/2)))
			   {
				 System.out.println(b.getId()+"\t\t"+b.getTitle()+"\t\t"+b.getAuthor()+"\t\t"+b.getGenre()+"\t\t"+b.getYear()+"\t\t"+b.getQuanity());
			   }
		}
		else
		{
			throw new NotFoundException1("Booke title is not present in system");
		}
		
	}

	@Override
	public void searchByAuthor(String author){
		if (bl.isEmpty()) 
		{
			throw new NotFoundException1("List is empty");
		}
		boolean isPresent=false;
		System.out.println("bookId\t\tTitle\t\tAuthorname\tGenre\t\tYear\t\tQuantity");
		Iterator<Book>itr=bl.iterator();
		while(itr.hasNext())
		{
			  Book b=itr.next();
			  String c1=author.toLowerCase();
			  String c2=b.getAuthor().toLowerCase();
			  int l=c1.length();
			  if(c2.substring(0,l/2).equals(c1.substring(0, l/2)))
			  {
				 isPresent=true;
			  }	
		}
		
		if(isPresent==true)
		{
			  Iterator<Book>itr1=bl.iterator();
			  Book b1=itr1.next();
			  String c1=author.toLowerCase();
			  String c2=b1.getAuthor().toLowerCase();
			  int l=c1.length();
			  if(c2.substring(0,l/2).equals(c1.substring(0, l/2)))
			  {
				  System.out.println(b1.getId()+"\t\t"+b1.getTitle()+"\t\t"+b1.getAuthor()+"\t\t"+b1.getGenre()+"\t\t"+b1.getYear()+"\t\t"+b1.getQuanity());
			  }
		}
		else
		{
			throw new NotFoundException1("Author name is not present in system");
		}
		
	}

	@Override
	public void displayAllBooks() {
		if (bl.isEmpty()) 
		{
			throw new NotFoundException1("List is empty");
		}
		System.out.println("bookId\t\tTitle\t\tAuthorname\tGenre\t\tYear\t\tQuantity");
		Iterator<Book> itr=bl.iterator();
	   while(itr.hasNext())
		{
		   Book b=itr.next();
		   System.out.println(b.getId()+"\t\t"+b.getTitle()+"\t\t"+b.getAuthor()+"\t\t"+b.getGenre()+"\t\t"+b.getYear()+"\t\t"+b.getQuanity());
		}
	}

	@Override
	public void displayBooksByGenere(String genre) {
		if (bl.isEmpty()) 
		{
			throw new NotFoundException1("List is empty");
		}
		HashMap<String, ArrayList<Book>> hs=new HashMap<>();
		Iterator<Book> itr=bl.iterator();
		
		while(itr.hasNext())
		{
			Book s=itr.next();
			String genre1=s.getGenre();
			
			if(hs.containsKey(genre1))
			{
				ArrayList<Book>ar=hs.get(genre1);
				ar.add(s);
				hs.put(genre,ar);
			}
			else
			{
				ArrayList<Book> ar=new ArrayList<>();
				ar.add(s);
				hs.put(genre, ar);
			}
		}
		Set<Entry<String, ArrayList<Book>>>se=hs.entrySet();
		Iterator<Entry<String, ArrayList<Book>>>itr1 = se.iterator();
		while(itr1.hasNext())
		{
			Entry<String, ArrayList<Book>>en=itr1.next();
			System.out.println("Book genre : "+en.getKey());
			ArrayList<Book> al=en.getValue();
			Iterator<Book> it=al.iterator();
			System.out.println("bookId\t\tTitle\t\tAuthorname\tGenre\t\tYear\t\tQuantity");
			while(it.hasNext())
			{
				Book b=it.next();
				System.out.println(b.getId()+"\t\t"+b.getTitle()+"\t\t"+b.getAuthor()+"\t\t"+b.getGenre()+"\t\t"+b.getYear()+"\t\t"+b.getQuanity());
			}
		}
	}
		
	

}
