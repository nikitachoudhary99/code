package com.univ;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Product;

/**
 * Hello world!
 *
 */
public class App2 
{   static SessionFactory sf;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hbm.cfg.xml");
        sf=cfg.buildSessionFactory();
    }
    static void selectSum()
    {
    	
    }
}
