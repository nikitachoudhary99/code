package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Department;
import com.ak.Entity.Employee;

/**
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tnx=session.beginTransaction();
        
        Employee e1=session.get(Employee.class,101);
        Department d1=session.get(Department.class,20);
        e1.setDept(d1);
       
        
        	e1.setDept(d1);
        
        		session.save(e1);//Exception Duplicate Foreign keyy
        		
        		session.save(d1);
        		
        		tnx.commit();
        		session.close();
        		sf.close();
    }
}
