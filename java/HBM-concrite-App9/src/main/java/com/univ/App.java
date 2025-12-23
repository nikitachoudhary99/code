package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Clerck;
import com.univ.Entity.Employee;
import com.univ.Entity.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tnx=session.beginTransaction();
        //Employee emp = new Employee(104, "rajiv", 102000);  // OK
        Manager mgr = new Manager(105, "raghav", 562000, 13, "Electronic"); // Change ID to 111
        Clerck clr = new Clerck(106, "krishna", 35066, 1120, 12100); // Also unique
        //gsession.save(emp);
        session.save(mgr);
        session.save(clr);
       
        
        tnx.commit();
        session.close();
        sf.close();
    }
}
