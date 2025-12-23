package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.AadharCard;
import com.ak.Entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tnx=session.beginTransaction();
        Person p=new Person(1014,"neha",20);
        AadharCard ac=new AadharCard(1015,"12365478","20/3/23");
        Person p1=new Person(1012,"neha",20);
        AadharCard ac1=new AadharCard(1013,"12365478","20/3/23");
        p.setAc(ac);
        p1.setAc(ac1);
        session.save(p);
        session.save(ac);
        tnx.commit();
       
    }
}
