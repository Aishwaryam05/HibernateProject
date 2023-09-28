package com.hibernateproject.thursdayHibernateProject;   //package name

import org.hibernate.Session;   
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App  //main class
{
    public static void main( String[] args )       //main method
    {
    	System.out.println( "project started" );
        Configuration cfg = new Configuration(); 
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();   // we create the session
        Customer c1 = new Customer(); // creating the object of entity class i.e. customer_details
        // setting the value of the values
        c1.setCust_id(01);
        c1.setCust_name("yash");
        c1.setMob_no("9850780045");
        c1.setCity("Pune");
        
        //creating object of project
        Product p1=new Product();
        p1.setPid(101);  // we set the values
        p1.setPname("Toothpaste");
        p1.setPro_price(50);
        
       // one to one   mapping     
        // passing the object of project in student
        c1.setProd(p1);
        // opening the session
        Session session=factory.openSession(); 
        //starting the session
        
        Transaction tx=session.beginTransaction();
        session.save(c1);   // we save the customer 
        session.save(p1);
        
        tx.commit();   // we commit the transaction
        session.close(); // we close the session
        factory.close(); // we close the factory
 
     }
}
