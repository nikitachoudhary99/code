package com.univ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.univ.entity.Clerk;
import com.univ.entity.Employee;
import com.univ.entity.Manager;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();
   
        Query q = session.createQuery("from Employee");
        List<Employee>lst = q.getResultList();
        for (Employee employee : lst) {
			System.out.println(employee.getEmpId()+"\t"
					+employee.getEmpName()+"\t"+employee.getSalary());
		}
        
        
        tnx.commit();
        session.close();
        sf.close();
    }
}
