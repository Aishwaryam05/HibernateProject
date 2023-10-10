package com.hibernateproject.hibernateproject2;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Student_Detail")  // we are declaring the entity file 
@Table(name="Student_Information")      // giving the name to the table
public class Student
{
	@Id  // set to primary key
   private int id;
   private String name;
   @OneToOne
   @JoinColumn
   private Project proj;
public Student(int id, String name, Project proj) {
	super();
	this.id = id;
	this.name = name;
	this.proj = proj;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Project getProj() {
	return proj;
}
public void setProj(Project proj) {
	this.proj = proj;
}
   
   
}
