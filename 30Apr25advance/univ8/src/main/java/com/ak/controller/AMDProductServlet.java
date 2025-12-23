package com.ak.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ak.daoimpl.ProductDaoImpl;
import com.ak.pojo.Product;

@WebServlet("/AMDProductServlet")
public class AMDProductServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product pd = new Product();
		try {
			pd.setpId(Integer.parseInt(request.getParameter("pid")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		pd.setpName(request.getParameter("pname"));
		try {
			pd.setPrice(Double.parseDouble(request.getParameter("price")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		String op = request.getParameter("b1");
		ProductDaoImpl daoimpl = new ProductDaoImpl();
		if(op.equals("Add Product"))
		{
			if(daoimpl.addProduct(pd))
				request.setAttribute("msg","Product Added Successfully");
			else
				request.setAttribute("msg","Product Could Not Be Added");
			
		}
		if(op.equals("Update Product"))
		{
			if(daoimpl.updateProduct(pd))
				request.setAttribute("msg","Product Updated Successfully");
			else
				request.setAttribute("msg","Product Could Not Be Updated");
			
		}
		if(op.equals("Update Product Detail"))
		{
			if(daoimpl.updateProduct(pd))
				request.setAttribute("msg","Product Updated Successfully");
			else
				request.setAttribute("msg","Product Could Not Be Updated");
			
			RequestDispatcher rd1  = request.getRequestDispatcher("/modifyproduct.jsp");
			rd1.forward(request, response);
		}
		
		if(op.equals("Delete Product"))
		{
			if(daoimpl.deleteProduct(pd))
				request.setAttribute("msg","Product Deleted Successfully");
			else
				request.setAttribute("msg","Product Could Not Be Deleted");
		}
		
//		RequestDispatcher rd = 
//		getServletContext().getRequestDispatcher("/amdproduct.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/amdproduct.jsp");
		rd.forward(request, response);
		
	}

}
