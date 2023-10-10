package com.hibernateproject.hibernateManyToMany1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;

@Table(name="student_info")
@Entity(name="student_Details")
public class Student 
{
	@Id
	@Column(name="Student_id")
	private int sid;
	@Column(name="Student_name")
	private String sname;
	@ManyToMany
	@JoinTable(name="Student_Project",joinColumns= {@JoinColumn(name="sid")},
	inverseJoinColumns= {@JoinColumn(name="pid")})
	
	private List<Project> proj;
	public Student(int sid, String sname, List<Project> proj) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.proj = proj;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Project> getProj() {
		return proj;
	}
	public void setProj(List<Project> proj) {
		this.proj = proj;
	}
	

}
