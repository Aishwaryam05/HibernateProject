package com.hibernateproject.hibernateproject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    
    {
        System.out.println( "project started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
       //  System.out.println(factory.isClosed());
        Student s1 = new Student(); // creating the object of entity class
        // setting the value of the values
        s1.setId(102);
        s1.setName("yash");
        
        //creating object of project
        Project p1=new Project();
        p1.setPid(202);
        p1.setPname("employee mgmt");
        
        
 /* 1 one to one       
        // passing the object of project in student
        s1.setProj(p1);
  */      
        
        s1.setProj(p1);
        p1.setStud(s1);
        // opening the session
        Session session=factory.openSession(); 
        //starting the session
        
        Transaction tx=session.beginTransaction();
        session.save(s1);
        session.save(p1); 

        
        tx.commit();

    }
}

