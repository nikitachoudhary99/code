package com.univ;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.ak.Entity.Student;

public class App2 {
    static SessionFactory sf;

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("student.cfg.xml");
        sf = cfg.buildSessionFactory();

        System.out.println("***Select In***");
        selectIn();
    }

    static void selectIn() {
        Session session = sf.openSession();
        Transaction tnx = session.beginTransaction();

        Criteria q = session.createCriteria(Student.class);
        List<Integer> ls = Arrays.asList(1, 4, 10);
        q.add(Restrictions.in("roll", ls));

        List<Student> lst = q.list();
        for (Student student : lst) {
            System.out.println(student);
        }

        tnx.commit();
        session.close();
    }

}
