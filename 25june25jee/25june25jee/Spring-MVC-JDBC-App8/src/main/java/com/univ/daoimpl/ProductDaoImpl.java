package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.ProductDao;
import com.univ.pojo.Product;

@Component
public class ProductDaoImpl implements ProductDao{

	private JdbcTemplate jTemplate;
	
	@Autowired
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public boolean addProduct(Product p) 
	{
		try {
			int count = jTemplate.update("insert into product values(?,?,?)",
				new Object[] {p.getpId(),p.getpName(),p.getPrice()});
			if(count>0)
				return true;
			else
				return false;
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
			int count = jTemplate.update("update product set pName = ?,"
					+ " price = ? where pId = ?",
				new Object[] {p.getpName(),p.getPrice(),p.getpId()});
			if(count>0)
				return true;
			else
				return false;
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
			int count = jTemplate.update("delete from product where pId = ?",p.getpId());
			if(count>0)
				return true;
			else
				return false;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product searchProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product>lst = new ArrayList<>();
		try {
			lst = jTemplate.query("select * from product",
					new BeanPropertyRowMapper<Product>(Product.class));
			if(lst.size()>0)
				return lst;
			else
				return null;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
