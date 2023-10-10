package com.hibernateproject.hibernateManyToMany1;

import java.util.ArrayList;
import java.util.List;

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
        
        SessionFactory factory = cfg.buildSessionFactory();   // we create the session
        Student s1 = new Student(); // creating the object of entity class
        // setting the value of the values
        s1.setSid(101);
        s1.setSname("yash");
        
        Student s2 = new Student(); // creating the object of entity class
        s2.setSid(102);
        s2.setSname("riya");
        
        Student s3 = new Student();
        s3.setSid(103);
        s3.setSname("Kavya");
        
        Project p1 = new Project();
        p1.setPid(201);
        p1.setPname("hotel mgmt");
        
        Project p2 = new Project();
        p2.setPid(202);
        p2.setPname("emp mgmt");

        Project p3 = new Project();
        p3.setPid(203);
        p3.setPname("office mgmt");
        
        
        List<Project> pro1 = new ArrayList<Project>();
        pro1.add(p1);
        pro1.add(p2);
        
        List<Project> pro2 = new ArrayList<Project>();
        pro2.add(p1);
        pro2.add(p3);
        
        s2.setProj(pro1);
        s3.setProj(pro2);
        s1.setProj(pro1);
        
        List<Student> stud1 = new ArrayList<Student>();
        stud1.add(s1);
        stud1.add(s2);
        p1.setStud(stud1);
        
        List<Student> stud2 = new ArrayList<Student>();
        stud2.add(s2);
        stud2.add(s3);
        p2.setStud(stud2);

        Session session=factory.openSession(); 
        //starting the session
        
        Transaction tx=session.beginTransaction();
        session.save(s1);
        session.save(s2); 
        session.save(s3); 
        session.save(p1); 
        session.save(p2); 
        session.save(p3); 
       
        tx.commit();
        session.close();
        factory.close(); 
        


    }
    }

