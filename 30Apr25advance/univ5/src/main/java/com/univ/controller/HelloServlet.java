package com.univ.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String msg = request.getParameter("t1");
		PrintWriter naina = response.getWriter();
		naina.print("<html><head><title>Naina Hello Servlet</title>");
		naina.print("</head><body><font color=green size=7>"+msg);
		naina.print("</font></body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
