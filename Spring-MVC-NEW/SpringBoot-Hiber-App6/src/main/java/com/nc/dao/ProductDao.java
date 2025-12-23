package com.nc.dao;

import java.util.List;

import com.nc.pojo.Product;

public interface ProductDao {
	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	boolean deleteProduct(int pId);
	Product getProduct(int pId);
	List<Product> getAllProduct();

}
