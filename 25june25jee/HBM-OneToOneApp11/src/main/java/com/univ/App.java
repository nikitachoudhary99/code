package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Department;
import com.univ.entity.Employee;

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
        
        Department d1 = new Department(10, "CS");
        Department d2 = new Department(20, "IT");
        
        Employee e1 = new Employee(101, "Radhe", 25000);
        Employee e2 = new Employee(102, "Mohan", 35000);
        
        e1.setDept(d1);
        e2.setDept(d2);
       // e2.setDept(d1);
  
        
        session.save(e1);
        session.save(e2);
        session.save(d1);
        session.save(d2);
        
        tnx.commit();
        session.close();
        sf.close();
    
    }
}
