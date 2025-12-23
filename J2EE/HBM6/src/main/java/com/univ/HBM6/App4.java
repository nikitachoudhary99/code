package com.univ.HBM6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.KiranaStore;

/**
 * Hello world!
 *
 */
public class App4 
{
    public static void main( String[] args )
    {
      Configuration cfg= new Configuration();
      cfg.configure("hbm.cfg.xml");
      SessionFactory sf=cfg.buildSessionFactory();
      Session session=sf.openSession();
      Transaction tnx=session.beginTransaction();
      KiranaStore kirana=session.get(KiranaStore.class,1);
      tnx.commit();
      session.close();
      sf.close();
      
    }
}
