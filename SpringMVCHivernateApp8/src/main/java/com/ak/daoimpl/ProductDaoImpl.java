package com.ak.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.ak.dao.ProductDao;
import com.ak.pojo.Product;

@Component
public class ProductDaoImpl implements ProductDao{
	
	private HibernateTemplate hTemplat;
	@Autowired
	public void sethTemplat(HibernateTemplate hTemplat) {
		this.hTemplat = hTemplat;
	}
	@Override
	@Transactional
	public boolean addProduct(Product p) {

		try
		{
			hTemplat.save(p);
				return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	@Transactional
	public boolean updateProduct(Product p) {
		try {
			
			hTemplat.update(p);
				return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	@Transactional
	public boolean deleteProduct(Product p) {
		try {

			hTemplat.delete(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Product searchProduct(int pid) {
		
		Product pd = null;
		try {
		
			//hTemplat.get(Product.class, pid);
			pd = hTemplat.execute(new HibernateCallback<Product>() {
				@Override
				public Product doInHibernate(Session session) throws HibernateException {
					Query q = session.createQuery("from Product "
							+ "where pId =:pid");
					q.setParameter("pid", pid);
					List<Product>lst = q.list();
					if(lst.size()>0)
						return lst.get(0);
					else
						return null;
								
					
				}
			});
			
			return pd;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Product> getAllProduct() {
		List<Product>lst = new ArrayList<>();
		//lst = hTemplat.loadAll(Product.class);
		try {
			lst =  hTemplat.execute(new HibernateCallback<List<Product>>() 
			{
				@Override
				public List<Product> doInHibernate(Session session) throws HibernateException {
				
					Query q = session.createQuery("from Product");
					List<Product>lst = q.list();
					if(lst.size()>0)
						return lst;
					else
						return null;
				}
			});
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}
	}
	
	

}
