package com.univ;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Department;
import entity.Employee;
import entity.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration();
         cfg.configure("hbm.cfg.xml");
     
         SessionFactory sf = cfg.buildSessionFactory();
         Session session = sf.openSession();
         Transaction tnx = session.beginTransaction();
         
         
         Employee e1 = new Employee(103, "RadheShyam", 25000);
         Department d1 = new Department(10, "CS");
         Department d2 = new Department(20, "IT");
         
         e1.getDepts().add(d1);
         e1.getDepts().add(d2);
           
//         Employee e1 = new Employee(102, "Shyam", 26000);
//         Department d1 = new Department(30, "DS");
//         Department d2 = new Department(40, "EC");
//         
//         e1.getDepts().add(d1);
//         e1.getDepts().add(d2);
         session.save(e1);
         session.save(d1);
         session.save(d2);

         
         
         tnx.commit();
         session.close();
         sf.close();
     
    }
}
