package com.blog.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.dao.UserDao;
import com.blog.daoimpl.UserDaoImpl;
import com.blog.pojo.User;

@WebServlet("/register")


public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        User user = new User();
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));

        UserDaoImpl dao = new UserDaoImpl();
        if (dao.registerUser(user)) {
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("register.jsp?error=1");
        }
    }
}
