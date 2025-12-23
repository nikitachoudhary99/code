package com.ak.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ak.dao.userinfodao;
import com.ak.daoimpl.UserInfoDaoimpl;
import com.ak.pojo.userinfo;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userinfo u=new userinfo();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		UserInfoDaoimpl daoimpl=new UserInfoDaoimpl();
		boolean isvalid=daoimpl.checkUserCredential(u);
		String target="";
		if(isvalid==true)
		{
			target="/home.jsp";
			request.setAttribute("username", u.getUsername());
		}
		else
		{
			target="/Login.jsp";
			request.setAttribute("msg","invalid username/password");
		}
		RequestDispatcher rd = 
				getServletContext().getRequestDispatcher(target);
			rd.forward(request, response);
	
	}

}
