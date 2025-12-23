package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Product;

public class App4 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Product pd = session.get(Product.class,101);
    	System.out.println(pd);
    	
    	tnx.commit();
    	session.close();
    	
    	Session session1 = sf.openSession();
    	Transaction tnx1 = session1.beginTransaction();
    	
    	Product pd1 = session1.get(Product.class,101);
    	System.out.println(pd1);
    	
    	
    	tnx1.commit();
    	session1.close();
    	sf.close();
    	
    }
}
