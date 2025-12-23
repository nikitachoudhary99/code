package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Address;
import com.univ.Entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tnx=session.beginTransaction();
        Address adr=new Address(1,"bijalpur","Indore");
        Address adr1=new Address(2,"bilaspur","cj");
        
        Person per=new Person(201,"ram");
        Person per1=new Person(202,"sita");
        Person per2=new Person(203,"luv");
        
        adr.getPerson().add(per);
        adr.getPerson().add(per1);
        adr.getPerson().add(per2);
        
        per.getAdr().add(adr);
        per.getAdr().add(adr1);
        
        per1.getAdr().add(adr);
        per1.getAdr().add(adr1);
        
        per2.getAdr().add(adr);
        per2.getAdr().add(adr1);
        
        session.save(per);
        session.save(per1);
        session.save(per2);
        session.save(adr);
        session.save(adr1);
        tnx.commit();
        session.close();
        sf.close();
        
        
    }
}
