package com.univ.daoimpl;

import java.util.List;

import com.univ.dao.ResultDao;
import com.univ.pojo.Result;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univ.dao.ResultDao;
import com.univ.pojo.Result;
@Repository
public class ResultDaoImpl implements ResultDao{
	


	    @Autowired
	    private SessionFactory sessionFactory;

	    private Session getSession() {
	        return sessionFactory.openSession();
	    }

	    @Override
	    public void saveResult(Result result) {
	        Session session = getSession();
	        Transaction tx = session.beginTransaction();
	        session.save(result);
	        tx.commit();
	        session.close();
	    }

	    @Override
	    public Result getResultById(int id) {
	        Session session = getSession();
	        Result result = session.get(Result.class, id);
	        session.close();
	        return result;
	    }

	    @Override
	    public List<Result> getAllResults() {
	        Session session = getSession();
	        List<Result> results = session.createQuery("from Result", Result.class).list();
	        session.close();
	        return results;
	    }

	    @Override
	    public void updateResult(Result result) {
	        Session session = getSession();
	        Transaction tx = session.beginTransaction();
	        session.update(result);
	        tx.commit();
	        session.close();
	    }

	    @Override
	    public void deleteResult(int id) {
	        Session session = getSession();
	        Transaction tx = session.beginTransaction();
	        Result result = session.get(Result.class, id);
	        if (result != null) {
	            session.delete(result);
	        }
	        tx.commit();
	        session.close();
	    }
	

	
	
}
