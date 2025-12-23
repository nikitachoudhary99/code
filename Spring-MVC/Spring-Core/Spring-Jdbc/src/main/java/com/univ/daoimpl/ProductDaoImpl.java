package com.univ.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.univ.dao.ProductDao;
import com.univ.pojo.Product;

public class ProductDaoImpl implements ProductDao {
  
	private JdbcTemplate jTemplate;

	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	   }

	
	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product searchProduct(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
