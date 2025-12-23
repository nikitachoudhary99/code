package com.univ;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ak.Entity.Bank;

/**
 * Hello world!
 *
 */
public class App2 
{	static SessionFactory sf;
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        sf=cfg.buildSessionFactory();
//        System.out.println("**SelectAll()***");
//        SelectAll();
       // System.out.println("**AccHolderAndAmmount()***");
        //AccHolderAndAmmount();
        System.out.println("****AccHolderAndAmmount***");
        AccHolderAndAmmount();
        
        sf.close();
        
    }
    static void SelectAll()
    {
    		Session session=sf.openSession();
            Transaction tnx=session.beginTransaction();
    
            Query q=session.createQuery("from Bank");
            List<String> lst=q.getResultList();
            for (String string : lst) {
				System.out.println(string);
			}
            tnx.commit();
            session.close();
  
    }
    static void AccHolderAndAmmount()
    {
    	Session session=sf.openSession();
    	Transaction tnx=session.beginTransaction();
    	
    	Query q=session.createQuery("select  AccHolder ,Ammount from Bank");
    	List<Object[]>lst=q.getResultList();
    	for (Object[] objects : lst) {
    		System.out.println(objects[0]+"\t"+objects[1]);
			
		}
    }
    
}
