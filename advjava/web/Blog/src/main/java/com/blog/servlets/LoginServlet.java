package com.blog.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.blog.daoimpl.UserDaoImpl;
import com.blog.pojo.User;

@WebServlet("/LoginServlet") //
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(email, password);

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            res.sendRedirect("Home.jsp"); // ✅ success login
        } else {
            req.setAttribute("msg", "❌ Invalid email or password.");
            req.getRequestDispatcher("login.jsp").forward(req, res);
        }
    }
}
