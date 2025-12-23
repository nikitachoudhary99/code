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
        
        Employee e3=new Employee(103,"rama",25652);
        	
        Department d1=session.get(Department.class,20);
        e3.setDept(d1);
       
        
        	e3.setDept(d1);
        
        		session.save(e3);//Exception Duplicate Foreign keyy
        		
        		session.save(d1);
        		
        		tnx.commit();
        		session.close();
        		sf.close();
    }
}
