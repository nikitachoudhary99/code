package com.ak.dao;

import java.util.List;

import com.ak.pojo.Product;

public interface ProductDao {

	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	boolean deleteProduct(Product p);
	Product searchProduct(int pid);
	List<Product> getAllProducts();
}
