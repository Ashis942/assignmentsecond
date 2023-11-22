package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

public class Library {
	

	@Autowired
	private Book bk;
	
	public Library(Book bk)
	{
		this.bk = bk;
	}
	public void displayBookDetails()
	{
		System.out.println(bk.toString());
	}
	

}
