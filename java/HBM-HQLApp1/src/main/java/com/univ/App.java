package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ak.Entity.Universal;

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
        Universal uni=new Universal();
        uni.setFaculty(2);
        uni.setFee(8630);
        uni.setfId(01);
        uni.setStudent("ram");
        uni.setSub("java");
        uni.setTime(1.30);
        session.save(uni);
        tnx.commit();
        
        session.close();
        sf.close();
    }
}
