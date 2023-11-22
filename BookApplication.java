package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

    @Bean
    Book bk()
	{
		return new Book("Innovation","ASHU");
	}
	
	@Bean
	Library lib(Book bk)
	{
		return new Library(bk);
	}

    @Bean
    Student stdt()
	{
		return new Student("Ashu",22);
		
	}
	
	@Bean
	public Classroom cr(Student stdt)
	{
		return new Classroom();
		
	}
}
