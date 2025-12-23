package com.nc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.nc.daoimpl.ProductDaoImpl;
import com.nc.pojo.Product;
@RestController
@RequestMapping("/product")
public class ProductController {
	  @Autowired
	    private ProductDaoImpl impl;

	    // Get all products
	    @GetMapping("/getAllProduct")
	    public List<Product> getAll() {
	        List<Product> lst = impl.getAllProduct();
	        return lst;
	    }

	    // Add new product
	    @PostMapping("/addNewProduct")
	    public HashMap<String, String> addProduct(@RequestBody Product p) {
	        HashMap<String, String> hm = new HashMap<>();
	        if (impl.addProduct(p)) {
	            hm.put("SUCCESS", "Product added successfully");
	        } else {
	            hm.put("ERROR", "Product could not be added");
	        }
	        return hm;
	    }

	    // Update product
	    @PutMapping("/updateProduct")
	    public HashMap<String, String> updateProduct(@RequestBody Product p) {
	        HashMap<String, String> hm = new HashMap<>();
	        if (impl.updateProduct(p)) {
	            hm.put("SUCCESS", "Product updated successfully");
	        } else {
	            hm.put("ERROR", "Product could not be updated");
	        }
	        return hm;
	    }

	    // Delete product
	    @DeleteMapping("/deleteProduct")
	    public HashMap<String, String> deleteProduct(@RequestParam("id") String pId) {
	        HashMap<String, String> hm = new HashMap<>();
	        int id = Integer.parseInt(pId);

	        if (impl.deleteProduct(id)) {
	            hm.put("SUCCESS", "Product deleted successfully");
	        } else {
	            hm.put("ERROR", "Product could not be deleted");
	        }
	        return hm;
	    }

	    // Search product by id
	    @GetMapping("/searchProduct")
	    public Product getProduct(@RequestParam("id") String pId) {
	        int id = Integer.parseInt(pId);
	        Product p = impl.getProduct(id);
	        return p;
	    }
}
