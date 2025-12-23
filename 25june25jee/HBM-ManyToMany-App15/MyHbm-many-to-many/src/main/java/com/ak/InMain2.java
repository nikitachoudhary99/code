package com.ak;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.entity.Department;

/**
 * Hello world!
 *
 */
public class InMain2 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tnx = session.beginTransaction();

        Criteria c = session.createCriteria(Department.class);
        
        List<Department>lst = c.list();
        for(Department d : lst)
        {
        	System.out.println(d+"\t"+d.getEmps());
        }
        tnx.commit();
        session.close();
        factory.close();
    }
}
