package com.univ;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ak.Entity.Address;

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
        System.out.println("**SelectAll()**");
        SelectAll();
        sf.close();
       
    }
    static void SelectAll()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         Query q=session.createQuery("from Address");
         List<Address> lst=q.getResultList();
         for(Address string : lst) {
				System.out.println(string);
			}
         tnx.commit();
         session.close();

         	
    }
    
}
