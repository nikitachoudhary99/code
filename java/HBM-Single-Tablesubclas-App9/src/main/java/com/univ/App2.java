package com.univ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.univ.Entity.Clerck;
import com.univ.Entity.Employee;
import com.univ.Entity.Manager;

/**
 * Hello world!
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
//        Query q=session.createQuery("from Employee");
//        List<Employee> lst=q.getResultList();
//        for (Employee employee : lst) {
//			System.out.println(employee.getEmpName()+"\t"+employee.getEnpId()+"\t"+employee.getSalary());
//		}
//        
//        Query q=session.createQuery("from Manager");
//        List<Manager> lst=q.getResultList();
//        for (Manager manager : lst) {
//			System.out.println(manager.getMgrId()+"\t"+Manager.getDept());
//		}
        Query q=session.createQuery("from clerck");
        List<Clerck> lst=q.getResultList();
        for (Clerck clerck : lst) {
			System.out.println(clerck);
		}
        
        tnx.commit();
        session.close();
        sf.close();
    }
}
