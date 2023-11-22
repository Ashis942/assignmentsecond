package com.example.demo;

public class Book 
{
	private String BookTitle;
	private String BookAuthor;
	
	public Book()
	{
		
	}
	
	public Book(String booktitle, String bookauthor)
	{
		BookTitle = booktitle;
		BookAuthor = bookauthor;
	}

	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [BookTitle=" + BookTitle + ", BookAuthor=" + BookAuthor + "]";
	}
	
	
	
	

}


