//to fetch data
package com.hibernateproject.hibernateproject4;

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
       //  System.out.println(factory.isClosed());Session session=factory.openSession(); 
        //starting the session
        Session session=factory.openSession(); 

        Transaction tx=session.beginTransaction();
        Project pj =(Project)session.get(Project.class, 201);
        System.out.println(pj.getPname());
        for(Student s:pj.getStud())
        {
        	System.out.println(s.getId()+" "+s.getName()+" "+s.getProj());
        }
        
        tx.commit();
        session.close();
        factory.close();
    }
}
