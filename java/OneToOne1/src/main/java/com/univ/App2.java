package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Passport;
import com.ak.Entity.Person;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tnx=session.beginTransaction();
    	
    	Person p=session.get(Person.class,1 );
    	Passport ps=session.get(Passport.class,2);
    	Person p1=session.get(Person.class,3);
    	Passport ps1=session.get(Passport.class,4);    	
    	
    	
    	session.save(ps1);
    	session.save(ps1);
    	session.save(p1);
    	session.save(p);
    	
    	tnx.commit();

    	session.close();
    	sf.close();
    	
    	
    	
    }
}
