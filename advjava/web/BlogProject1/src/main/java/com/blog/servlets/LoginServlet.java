package com.blog.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blog.dao.UserDao;
import com.blog.daoimpl.UserDaoImpl;
import com.blog.pojo.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name = request.getParameter("name");
		  String email = request.getParameter("email");
		    String password = request.getParameter("password");

		    UserDao dao = new UserDaoImpl();
		    User user = new User();
		    user.setName(name);
		    user.setEmail(email);
		    user.setPassword(password);


		    if (dao.checkuser(user)) {
		        request.setAttribute("msg", "login successfully");
		        RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		        rd.forward(request, response);
		    } else {
		    	request.setAttribute("msg", "Error in login");
		        RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
		        rd.forward(request, response);
		    }

		}
	

}
