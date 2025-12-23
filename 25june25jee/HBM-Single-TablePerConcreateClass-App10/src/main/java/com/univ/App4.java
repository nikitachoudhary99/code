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
public class App4 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();
   
        Query q = session.createQuery("from Clerk");
        List<Clerk>lst = q.getResultList();
        for (Clerk clerk : lst) {
        	System.out.println(clerk.getEmpId()+"\t"
					+clerk.getEmpName()+"\t"+clerk.getSalary()+"\t"
					+clerk.getTa()+"\t"+clerk.getDa());
		}
        	
		
			
		
        
        
        tnx.commit();
        session.close();
        sf.close();
    }
}
