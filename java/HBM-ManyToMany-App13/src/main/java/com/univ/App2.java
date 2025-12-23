package com.univ;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Department;
import entity.Employee;

/**
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");
    
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();
        
        
        Employee e3 = new Employee(103, "Ramkishore", 34000); 
        Department d2 = session.get(Department.class, 20);
        
       
        
        session.save(e3); //Exception Duplicate Foreign Key
        
        tnx.commit();
        session.close();
        sf.close();
    
    }
}
