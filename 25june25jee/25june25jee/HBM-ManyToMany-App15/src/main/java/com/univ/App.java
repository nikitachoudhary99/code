package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.entity.Department;
import com.univ.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");
    
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();
        
        Department dept = new  Department(111, "CS");
        Department dept1 = new  Department(112, "IT");
        
        Employee e = new Employee(101, "Radha Mohan", 20000);
        Employee e1 = new Employee(102, "Shyam Kumar", 19000);
        Employee e2 = new Employee(103, "Ankit Sharma", 19000);
       
        dept.getEmps().add(e);
        dept.getEmps().add(e1);
        
        dept1.getEmps().add(e1);
        dept1.getEmps().add(e2);
        
        e.getDepts().add(dept);
        e1.getDepts().add(dept);
        
        e1.getDepts().add(dept1);
        e2.getDepts().add(dept1);
        
        session.save(dept);
        session.save(dept1);
        
        session.save(e);
        session.save(e1);
        session.save(e2);
        
        
        tnx.commit();
        session.close();
        sf.close();
    
    }
}
