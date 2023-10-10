package com.hibernateproject.hibernateproject4;


//many to many 

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Project_details")
@Table(name="Project_Information")
public class Project 
{
	@Id   // it will create as primary key
	@Column(name="Project_Id")
	private int pid;
	@Column(name="Project_Name")
	private String pname;
	
	// adding one to many connection between project and student 
	@ManyToMany
	private List<Student> stud;

	public Project(int pid, String pname, List<Student> stud) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.stud = stud;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
	

}