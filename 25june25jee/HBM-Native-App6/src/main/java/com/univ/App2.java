package com.univ;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
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
//    	selectPnameAndPrice();
    	System.out.println("***Select Where***");
    	selectWhere();
//    	System.out.println("***Select Between And***");
//    	selectBetweenAnd();
//    	System.out.println("***Select In***");
//    	selectIn();
//    	System.out.println("***Select Sum***");
//    	selectSum();
//    	sf.close();
    	
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
    	Criteria q = session.createCriteria(Product.class);
    	ArrayList<Double>ls = new ArrayList<>();
    	ls.add(1200.0);
    	ls.add(3300.0);
    	ls.add(1000.0);
    	q.add(Restrictions.in("price", ls));
//    	q.setParameter("pr1", 1200.0);
//    	q.setParameter("pr2", 3300.0);
//    	q.setParameter("pr3", 1000.0);
    	List<Product>lst = q.list();
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
    	Criteria q = session.createCriteria(Product.class);
    	q.add(Restrictions.between("price", 1200.0, 3300.0));
    	
    	List<Product>lst = q.list();
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
    	
    	SQLQuery q = session.createSQLQuery("select * from product where pId = ?");
    	
    	//Query q = session.createQuery("from Product where price >=:pr1 and price<=:pr2");
    	q.setParameter(1, 101);
    	q.addEntity(Product.class);
//    	q.setParameter("pr2", 3300.0);
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
    	
    	SQLQuery q = session.createSQLQuery("select * from product");
    	q.addEntity(Product.class);
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
    	
    	SQLQuery q = session.createSQLQuery("select pName from product");
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
    	
    	SQLQuery q = session.createSQLQuery("select pName,price from product");
    	List<Object[]>lst = q.getResultList();
    	for (Object[] objects : lst) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}    	
    	tnx.commit();
    	session.close();	
    }
    
}
