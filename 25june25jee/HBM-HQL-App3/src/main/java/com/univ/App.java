package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Product pd = new Product("Mouse",1200);
    	
    	session.save(pd);
    	tnx.commit();
    	session.close();
    	sf.close();
    	
    }
}
