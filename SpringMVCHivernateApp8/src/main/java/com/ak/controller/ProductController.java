package com.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ak.dao.ProductDao;
import com.ak.daoimpl.ProductDaoImpl;
import com.ak.pojo.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;
	
	
	@GetMapping("/home")
	public String productIndex()
	{
		return "home";
	}
	@GetMapping("/search")
	public ModelAndView searchPage()
	{
		List<Product>lst = productDao.getAllProduct();
		ModelAndView mv = new ModelAndView("search","allproducts",lst);
		return mv;
	}
	@GetMapping("/amdproduct")
	public String amdProduct(Model m)
	{
		Product pd = new Product();
		m.addAttribute("pdObj",pd);
		return "amdproduct";
	}
	
	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("pdObj")Product pd,Model m,
			@RequestParam("b1")String op)
	{
		Product p = new Product();
		m.addAttribute("pdObj",p);
		if(op.equals("Add Product"))
		{
			if(productDao.addProduct(pd))
				m.addAttribute("msg","Product Added Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Added");
		}
		
		if(op.equals("Update Product"))
		{
			if(productDao.updateProduct(pd))
				m.addAttribute("msg","Product Upadated Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Upadated");
		}
		if(op.equals("Update Product Info"))
		{
			if(productDao.updateProduct(pd))
				m.addAttribute("msg","Product Upadated Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Upadated");
			return "modifyproduct";
		}
		if(op.equals("Delete Product"))
		{
			if(productDao.deleteProduct(pd))
				m.addAttribute("msg","Product Deleted Successfully");
			else
				m.addAttribute("msg","Product Could Not Be Deleted");
		}
		return "amdproduct";
		
	}
	
	@GetMapping("/listofproducts")
	public ModelAndView  getAllProduct()
	{
		List<Product>lst = productDao.getAllProduct();
		ModelAndView mv = new ModelAndView("listofproducts","allproducts",lst);
		return mv;
	}
	
	@PostMapping("/getproduct")
	public String getProduct(@RequestParam("s1")String pid,Model m)
	{
		
		ModelAndView mv = null;
		int id = Integer.parseInt(pid);
		Product pd = productDao.searchProduct(id);
		m.addAttribute("pdObj",pd);
		return "modifyproduct";
	}
}
