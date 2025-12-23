package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Passport;
import com.ak.Entity.Person;

public class App 
{
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();
        
       
        Person p = new Person(1, "Yash");
        Person p1 = new Person(3, "Yashvi");
        
     
        session.save(p);
        session.save(p1);
        
       
        Passport ps = new Passport(2, "P-Yash");   
        Passport ps1 = new Passport(4, "P-Yashvi");

                session.save(ps);
        session.save(ps1);

        tnx.commit();
        session.close();
        sf.close();

        System.out.println("Data saved successfully.");
    }
}
