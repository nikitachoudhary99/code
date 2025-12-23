package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.univ.daoimpl.ProductDaoImpl;
import com.univ.pojo.Product;

@Controller
public class ProductController {

	
	private ProductDaoImpl daoimpl;
	
	@Autowired
	public void setDaoimpl(ProductDaoImpl daoimpl) {
		this.daoimpl = daoimpl;
	}

	@GetMapping("/home")
	public String homePage()
	{
		return "home";
	}
	@GetMapping("/amdproduct")
	public String amdProduct(Model m)
	{
		Product p = new Product();
		m.addAttribute("prdObj",p);
		return "amdproduct";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("prdObj")Product p,
			@RequestParam("b1")String op,Model m)
	{
		if(op.equals("Add Product"))
		{
			if(daoimpl.addProduct(p))
				m.addAttribute("msg","Product Added Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Added ");
		}
		if(op.equals("Update Product"))
		{
			if(daoimpl.updateProduct(p))
				m.addAttribute("msg","Product Updated Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Updated ");
		}
		if(op.equals("Delete Product"))
		{
			if(daoimpl.deleteProduct(p))
				m.addAttribute("msg","Product Deleted Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Deleted ");
		}
		Product p1 = new Product();
		m.addAttribute("prdObj",p1);
		return "amdproduct";
	}
	
	@GetMapping("/listproduct")
	public String getAllProduct(Model m)
	{
		List<Product>lst = daoimpl.getAllProducts();
		m.addAttribute("allproduct",lst);
		return "listproduct";
	}
}
