package com.ak.servlets;


import com.ak.dao.BlogDao; 
import com.ak.daoimpl.BlogDaoImpl;
import com.ak.pojo.Blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/viewBlog")
public class ViewBlogServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        BlogDao dao = new BlogDaoImpl();
        Blog blog = dao.getById(id);

        req.setAttribute("blog", blog);
        req.getRequestDispatcher("post.jsp").forward(req, res);
    }
}
