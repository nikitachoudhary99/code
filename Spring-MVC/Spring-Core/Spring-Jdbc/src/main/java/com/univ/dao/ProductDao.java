package com.univ.dao;

import java.util.List;

import com.univ.pojo.Product;

public interface ProductDao {
	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	boolean deleteProduct(Product p);
	Product searchProduct(int pId);
	List<Product> getAllProducts();
	

}
