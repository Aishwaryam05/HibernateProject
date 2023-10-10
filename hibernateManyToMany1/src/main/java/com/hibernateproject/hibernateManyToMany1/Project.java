package com.hibernateproject.hibernateManyToMany1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="Project_info")
@Entity(name="Project_Details")
public class Project {
	@Id
	@Column(name="Project_id")
	private int pid;
	@Column(name="Project_name")
	private String pname;
	
	@ManyToMany(mappedBy="proj")
	
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
