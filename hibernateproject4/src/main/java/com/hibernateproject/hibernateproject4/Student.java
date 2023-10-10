package com.hibernateproject.hibernateproject4;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Student_Detail")  // we are declaring the entity file 
@Table(name="Student_Information")      // giving the name to the table
public class Student
{
	@Id  // set to primary key
	@Column(name="Student_id")  //give name to table
   private int id;
	@Column(name="Student_name")   
   private String name;
	@OneToMany
	private List<Project> proj;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, List<Project> proj) {
		super();
		this.id = id;
		this.name = name;
		this.proj = proj;
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
	public List<Project> getProj() {
		return proj;
	}
	public void setProj(List<Project> proj) {
		this.proj = proj;
	}
	
	
	
}