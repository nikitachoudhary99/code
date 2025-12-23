package com.univ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ak.entity.Product;

public class App2 
{
	static SessionFactory sf;
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hbm.cfg.xml");
    	
    	sf = cfg.buildSessionFactory();
    	
//    	System.out.println("***Select All***");
//    	selectAll();
//    	System.out.println("***Select Pname***");
//    	selectPname();
//    	System.out.println("***Select Pname And Price***");
//    	selectPnameAndPrice();
//    	System.out.println("***Select Where***");
//    	selectWhere();
//    	System.out.println("***Select Between And***");
//    	selectBetweenAnd();
//    	System.out.println("***Select In***");
//    	selectIn();
    	System.out.println("***Select Sum***");
    	selectSum();
    	sf.close();
    	
    }
    static void selectSum()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	//Query q = session.createQuery("from Product where pId =:id");
    	Query q = session.createQuery
    		("select sum(price) from Product");
    	
    	List<Double>lst = q.getResultList();
    	for (Double double1 : lst) {
			System.out.println("Sum = "+double1);
		}
    	
    	tnx.commit();
    	session.close();
    	
    }
    static void selectIn()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	//Query q = session.createQuery("from Product where pId =:id");
    	Query q = session.createQuery
    		("from Product where price in(:pr1,:pr2,:pr3)");
    	q.setParameter("pr1", 1200.0);
    	q.setParameter("pr2", 3300.0);
    	q.setParameter("pr3", 1000.0);
    	List<Product>lst = q.getResultList();
    	for (Product product : lst) {
			System.out.println(product);
		}
    	
    	tnx.commit();
    	session.close();
    	
    }
    static void selectBetweenAnd()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	//Query q = session.createQuery("from Product where pId =:id");
    	Query q = session.createQuery
    		("from Product where price between :pr1 and :pr2");
    	q.setParameter("pr1", 1200.0);
    	q.setParameter("pr2", 3300.0);
    	List<Product>lst = q.getResultList();
    	for (Product product : lst) {
			System.out.println(product);
		}
    	
    	tnx.commit();
    	session.close();
    	
    }
    static void selectWhere()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	//Query q = session.createQuery("from Product where pId =:id");
    	Query q = session.createQuery
    		("from Product where price >=:pr1 and price<=:pr2");
    	q.setParameter("pr1", 1200.0);
    	q.setParameter("pr2", 3300.0);
    	List<Product>lst = q.getResultList();
    	for (Product product : lst) {
			System.out.println(product);
		}
    	
    	tnx.commit();
    	session.close();
    	
    }
    static void selectAll()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Query q = session.createQuery("from Product");
    	List<Product>lst = q.getResultList();
    	for (Product product : lst) {
			System.out.println(product);
		}
    	
    	tnx.commit();
    	session.close();
    	
    }
    static void selectPname()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Query q = session.createQuery("select pName from Product");
    	List<String>lst = q.getResultList();
    	for (String string : lst) {
			System.out.println(string);
		}
    	
    	tnx.commit();
    	session.close();	
    }
    static void selectPnameAndPrice()
    {
    	Session session = sf.openSession();
    	Transaction tnx = session.beginTransaction();
    	
    	Query q = session.createQuery("select pName,price from Product");
    	List<Object[]>lst = q.getResultList();
    	for (Object[] objects : lst) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}    	
    	tnx.commit();
    	session.close();	
    }
    
}
