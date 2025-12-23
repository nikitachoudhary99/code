package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.ProductDao;
import com.univ.pojo.Product;

@Component
public class ProductDaoImpl implements ProductDao{

	private HibernateTemplate hTemplate;
	
	@Autowired
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	@Override
	public boolean addProduct(Product p) 
	{
		try {
			hTemplate.save(p);
				return true;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product p) {
		try {
			hTemplate.update(p);
			return true;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(Product p) {
		try {
			
			hTemplate.delete(p);
				return true;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product searchProduct(int pid) {
		try {
			Product p = hTemplate.get(Product.class, pid);
			if(p!=null)
				return p;
			else
				return null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product>lst = new ArrayList<>();
		try {
			lst =  hTemplate.loadAll(Product.class);
				return lst;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
