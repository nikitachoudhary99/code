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
    	sf.close();
    	
    }
}
