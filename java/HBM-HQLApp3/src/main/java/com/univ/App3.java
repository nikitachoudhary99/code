package com.univ;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ak.Entity.Product;

/**
 * Hello world!
 *
 */
public class App3 
{
	static SessionFactory sf;
    public static void main( String[] args )
    {
    	
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
         
        sf=cfg.buildSessionFactory();
       // System.out.println("**SelectAll**");
        //SelectAll();
    // System.out.println("**SelectPname**");
      // SelectPname();
       // System.out.println("**SelectPnameAndPrice**");
       // SelectPNameAndPrice();
       // ////Session session=sf.openSession();
       // ////Transaction tnx=session.beginTransaction();
        
       // // //Product pd=new Product("mouse",500);
       // // //session.update(pd);
//        System.out.println("*SelectWhere*");
//        SelectWhere();
//       
       // System.out.println("*SelectIn*");
       // SelectIn();
        System.out.println("*SelectSum*");
        SelectSum();
       
        sf.close();
    }
    static void SelectAll()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
         Query q=session.createQuery("from Product");
         
         List<Product>lst=q.getResultList();
         for(Product product :lst)
         {
        	 System.out.println(product);
         }
         tnx.commit();
         session.close();
    }
    static void SelectPname()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
         Query q=session.createQuery("select pName from Product");
         
         List<String>lst=q.getResultList();
         for (String string : lst) {
			System.out.println(string);
		}
         tnx.commit();
         session.close();
    }
    static void SelectPNameAndPrice()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
         Query q=session.createQuery("select pName,Price from Product");
         
         List<Object[]>lst=q.getResultList();
         for (Object[] objects : lst) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
         tnx.commit();
         session.close();
    }
    static void SelectWhere()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
        // Query q=session.createQuery("from Product where pId=:id");
         //q.setParameter("id", 10);
//         Query q=session.createQuery("from Product where price<=:pr");
//         q.setParameter("pr", 400.0);
         Query q=session.createQuery("from Product where price>=:pr1 and price<=:pr2");
         q.setParameter("pr1", 400.0);
         q.setParameter("pr2", 3800.0);
         List<Product>lst=q.getResultList();
         for(Product product :lst)
         {
        	 System.out.println(product);
         }
         tnx.commit();
         session.close();
    }
    static void SelectBetweenAnd()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
       Query q=session.createQuery("from Product where price between >=:pr1 and :pr2");
         q.setParameter("pr1", 400.0);
         q.setParameter("pr2", 3800.0);
         List<Product>lst=q.getResultList();
         for(Product product :lst)
         {
        	 System.out.println(product);
         }
         tnx.commit();
         session.close();
    }
    static void SelectIn()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
       Query q=session.createQuery("from Product where price in(:pr1,:pr2,pr3)");
         q.setParameter("pr1", 900.0);
         q.setParameter("pr2", 3800.0);
         q.setParameter("pr3", 800.0);
         List<Product>lst=q.getResultList();
         for(Product product :lst)
         {
        	 System.out.println(product);
         }
         tnx.commit();
         session.close();
    }
    static void SelectSum()
    {
    	 Session session=sf.openSession();
         Transaction tnx=session.beginTransaction();
         
       Query q=session.createQuery("select sum(price) from Product");
        
         List<Double>lst=q.getResultList();
         for(Double double1 :lst)
         {
        	 System.out.println(double1);
         }
         tnx.commit();
         session.close();
    }
}
