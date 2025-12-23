package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration();
        cfg.configure("student.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tnx=session.beginTransaction();
        Student st = new Student(0,"nikita", "bijalpur", "java", "IET-DAVV");
        session.save(st);
        tnx.commit();
        session.close();
        sf.close();
    }
}
