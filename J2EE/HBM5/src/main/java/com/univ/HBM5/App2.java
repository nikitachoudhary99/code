package com.univ.HBM5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Book;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
      Configuration cfg= new Configuration();
      cfg.configure("hbm.cfg.xml");
      
      SessionFactory sf=cfg.buildSessionFactory();
      Session session=sf.openSession();
      Transaction tnx=session.beginTransaction();
      
     Book book=new Book("math","AanadGupta",1500);
     session.update(book);
     tnx.commit();
     
     session.close();
     sf.close();
     
    }
}
