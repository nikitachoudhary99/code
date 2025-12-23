package com.ak;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.entity.Department;
import com.ak.entity.Employee;


/**
 * Hello world!
 *
 */
public class InMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tnx = session.beginTransaction();
        
        
        Employee e = new Employee(101, "Radha Mohan", 20000);
        Employee e1 = new Employee(102, "Shyam Kumar", 19000);
        Set<Employee> st = new HashSet<Employee>();
        st.add(e);
        st.add(e1);
        
        Department dept = new  Department(111, "CS");
        dept.setEmps(st);
        session.save(e);
        session.save(e1);
        session.save(dept);
        
        tnx.commit();
        session.close();
        factory.close();
    }
}

