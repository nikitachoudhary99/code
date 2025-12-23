package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Product;

public class App2 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Product pd = new Product(101, "Mouse-I-Ball", 1200);
    	
    	session.update(pd);
    	tnx.commit();
    	
    	session.close();
    	sf.close();
    	
    }
}
