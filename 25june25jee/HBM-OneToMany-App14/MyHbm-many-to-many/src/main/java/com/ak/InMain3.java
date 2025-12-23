package com.ak;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.entity.Employee;
import com.ak.entity.Manager;

/**
 * Single Table Per Bean
 *
 */
public class InMain3 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tnx = session.beginTransaction();

        Criteria c = session.createCriteria(Employee.class);
        List<Employee>lst = c.list();
        for (Employee employee : lst) {
			System.out.println(employee);
		}
        tnx.commit();
        session.close();
        factory.close();
    }
}
