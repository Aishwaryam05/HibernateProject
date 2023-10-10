package com.project.hibernateproject1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="Student_Detail")  // we are declaring the entity file 
@Table(name="MyStudent")      // giving the name to the table
public class Student
{
	@Id  // set to primary key
   private int id;
   private String name;
   
   //creating constructors
  public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

//creating getter setter
public int getId()  // print the data
{
	return id;
}
public void setId(int id)   // use to set data
{
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

   
}
