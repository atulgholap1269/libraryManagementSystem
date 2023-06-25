package com.service;

public class Book {
	private int id;
	private String title;
	private String author;
	private String genre;
	private int year;
	private int quanity;

	public Book(int id, String title, String author, String genre, int year, int quanity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
		this.quanity = quanity;
	}

	public Book()
	{

	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", year=" + year
				+ ", quanity=" + quanity + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

}
