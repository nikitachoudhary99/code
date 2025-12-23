package com.univ.HBM4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Student;

/**
 * Hello world!
 *
 */
public class App4 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration();
        cfg.configure("NewFile.xml");
        
        SessionFactory sf= cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tnx=session.beginTransaction();
        
        Student stud= new Student(102,"ram",450,"ram@123.gmail.com"); 
        session.delete(stud);
        tnx.commit();
        
        session.close();
        sf.close();
    }
}
