package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Clerk;
import com.univ.entity.Employee;
import com.univ.entity.Manager;

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
   
        Employee emp = new Employee(101, "Radhe", 25000);
        Manager mgr = new Manager(102, "Mohan", 30000, 10, "CS");
        Clerk clr = new Clerk(103, "Keshav", 35000, 1200, 1100);
        
        session.save(emp);
        session.save(mgr);
        session.save(clr);
        
        tnx.commit();
        session.close();
        sf.close();
    }
}
