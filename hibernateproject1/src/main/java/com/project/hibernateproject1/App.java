package com.project.hibernateproject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
        System.out.println( "project started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
       //  System.out.println(factory.isClosed());
        Student st = new Student(); // creating the object of entity class
        // setting the value of the values
        st.setId(101);
        st.setName("radha");
        
        // opening the session
        Session session=factory.openSession(); 
        //starting the session
        Transaction tx=session.beginTransaction();
        session.save(st); 
        tx.commit();

    }
}
