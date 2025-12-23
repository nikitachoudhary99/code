package com.univ.HBM3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Employee;

/**
 * Hello world!
 *
 */
public class App4 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("NewFile.xml");
      
      SessionFactory sf=cfg.buildSessionFactory();
      
      Session session = sf.openSession();
      Transaction tnx= session.beginTransaction();
      
      Employee emp= session.get(Employee.class,101);
      System.out.println(emp);
      tnx.commit();
      session.close();
      sf.close();
      
      
    }
}
