package com.univ.dao;

import java.util.List;

import com.univ.pojo.Product;

public interface ProductDao {
boolean addProduct(Product pd);
boolean updateProduct(Product pd);
boolean deleteProduct(Product pd);
Product searchProduct(int pId);
List<Product> getAllProducts();

}
