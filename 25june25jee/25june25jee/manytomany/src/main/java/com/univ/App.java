package com.univ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.univ.Entity.Address;
import com.univ.Entity.Employee;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hbm.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();

        // Create employees
        Employee e1 = new Employee(101, "Radha Mohan", 20000);
        Employee e2 = new Employee(102, "Shyam Kumar", 19000);
        Employee e3 = new Employee(103, "Ankit Sharma", 19000);

        // Create addresses
        Address a1 = new Address();
        a1.setStreet("Bijlpur");
        a1.setCity("Indore");

        Address a2 = new Address();
        a2.setStreet("MG Road");
        a2.setCity("Ujjain");

        // Assign relations
        e1.getAdrs().add(a1);
        e2.getAdrs().add(a2);
        e3.getAdrs().add(a1);  // many-to-many

        session.save(e1);
        session.save(e2);
        session.save(e3);

        tnx.commit();
        session.close();
        sf.close();

        System.out.println("Data saved successfully!");
    }
}
