package com.hibernateproject.thursdayHibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Customer_Detail")  // we are declaring the entity file 
@Table(name="Customer_Information")      // giving the name to the table
public class Customer {
	@Id  // set to primary key
	@Column(name="Customer_id")   
	   private int cust_id;
	@Column(name="Customer_name")   
	   private String cust_name;
	@Column(name="Customer_Mobile_Number")   
	   private String mob_no;
	@Column(name="Customer_city")   
	   private String city;
	   
	   @OneToOne     // we create one to one mapping
	   @JoinColumn     // join the column in customer table
	   private Product prod; 

	   // we create the constructors
	public Customer(int cust_id, String cust_name, String mob_no, String city, Product prod) 
	{
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.mob_no = mob_no;
		this.city = city;
		this.prod = prod;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
 // we add the getter setters
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	   

}
