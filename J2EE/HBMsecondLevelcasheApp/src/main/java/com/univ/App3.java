package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Product;

/**
 * Hello world!
 *
 */
public class App3 
{
    public static void main( String[] args )
    {
       Configuration cfg= new Configuration();
       cfg.configure("HBM.xml");
       
       SessionFactory sf = cfg.buildSessionFactory();
       
       Session session = sf.openSession();
       Transaction tnx = session.beginTransaction();
       
       Product pd= new Product(101,"keyboard",650);
       
       session.update(pd);
       tnx.commit();
       
       session.close();
       sf.close();
    }
}
