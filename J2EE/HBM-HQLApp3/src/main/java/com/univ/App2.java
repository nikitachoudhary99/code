package com.univ;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ak.Entity.Product;

/**
 * Hello world!
 *
 */
public class App2 
{
	static SessionFactory sf;
    public static void main( String[] args )
    {
    	
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
         
        sf=cfg.buildSessionFactory();
        System.out.println("**SelectAll**");
        SelectAll();
        //Session session=sf.openSession();
        //Transaction tnx=session.beginTransaction();
        
        //Product pd=new Product("mouse",500);
        //session.update(pd);
       
        sf.close();
    }
    static void SelectAll()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
         Query q=session.createQuery("from Product");
         
         List<Product>lst=q.getResultList();
         for(Product product :lst)
         {
        	 System.out.println(product);
         }
         tnx.commit();
         session.close();
    }
}
