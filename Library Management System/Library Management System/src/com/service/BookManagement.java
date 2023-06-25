package com.service;

public interface BookManagement {
    public void addBook(Book book);
    public void removeBook(int id);
    public void searchTitle(String title);
    public void searchByAuthor(String author);
    public void displayAllBooks();
    public void displayBooksByGenere(String genre);
    
}
