package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class ApplicationRunnerImpl implements ApplicationRunner
{
	@Autowired
	private Library lib;
	
	@Autowired
	private Classroom cr;

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		lib.displayBookDetails();
		cr.displayStudentDetails();
		
	}
	

}


