package com.hibernateproject.hibernateproject2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Project_details")
@Table(name="Project_Information")
public class Project {
	@Id
	@Column(name="Project_Id")
	private int pid;
	@Column(name="Project_Name")
	private String pname;
	
	@OneToOne
	@JoinColumn(name="Stud_id")
	private Student stud;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, Student stud) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.stud = stud;
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

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}


}
