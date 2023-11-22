package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classroom {
	
@Autowired
public Student stdt;

public void classroom(Student stdt)
{
	this.stdt = this.stdt;
}

public void displayStudentDetails()
{
	System.out.println(stdt.toString());
	
}
}
