package com.univ.Inheritance1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Animal;
import com.ak.Entity.Cat;
import com.ak.Entity.Dog;

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
    	
    	Animal ani=new Animal("girraph",20);
    	Dog dog=new Dog("cangaro",10,"Can",12);
    	Cat cat=new Cat("rat",2,"white",3);
    	
    	session.save(ani);
    	session.save(cat);
    	session.save(dog);
    	
    	tnx.commit();
    	session.close();
    	sf.close();
    }
}
