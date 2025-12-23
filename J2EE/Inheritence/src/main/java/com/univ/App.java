package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Account;
import com.ak.Entity.Costumer;
import com.ak.Entity.Loan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tnx=session.beginTransaction();
    	
    	Costumer cust=new Costumer(101,"ram");
    	Account acc=new Account(102,"raja",10254,"rama",1200.3);
    	Loan lon=new Loan(103,"ramchandra","raka",1000.2);
    	
    	
    	session.save(lon);
    	session.save(acc);
    	session.save(cust);
    	tnx.commit();
    	
    	session.close();
    	sf.close();
    }
}
