package com.hibernateproject.thursdayHibernateProject; //package name 

import javax.persistence.Column;
import javax.persistence.Entity; // importing files 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Product_details")   // we are declaring the entity file 
@Table(name="Product_Information") // giving the name to the table

public class Product 
{
	
		@Id  // set to primary key
		@Column(name="Product_Id") // give the name in column which is chnage to id to Product_id
		private int pid;  // declare the datatype
		@Column(name="Product_Name")
		private String pname;
		@Column(name="Product_Price")
		private int pro_price;
		
		@OneToOne
		@JoinColumn(name="Customer_id")
		private Customer cust;

		// create constructors
		public Product(int pid, String pname, int pro_price, Customer cust) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pro_price = pro_price;
			this.cust = cust;
		}

		public Product() {
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

		public int getPro_price() {
			return pro_price;
		}

		public void setPro_price(int pro_price) {
			this.pro_price = pro_price;
		}

		public Customer getCust() {
			return cust;
		}

		public void setCust(Customer cust) {
			this.cust = cust;
		}
		
		
		
}
