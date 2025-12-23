package com.nc.repository;

import org.springframework.data.repository.CrudRepository;

import com.nc.pojo.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
