package Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ak.daoimpl.BlogDaoImpl;
import com.ak.pojo.Blog;
import com.ak.pojo.User;

@WebServlet("/deleteBlog")
public class DeleteBlogServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        int id = Integer.parseInt(req.getParameter("id"));

        try {
            BlogDaoImpl dao = new BlogDaoImpl();
            Blog blog = dao.getById(id);
            if (blog.getUserId() == ((User) session.getAttribute("user")).getId()) {
                dao.delete(id);
            }
            res.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("index.jsp?error=1");
        }
    }
}
