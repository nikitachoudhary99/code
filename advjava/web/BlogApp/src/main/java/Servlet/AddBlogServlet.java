package Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ak.dao.BlogDao;
import com.ak.daoimpl.BlogDaoImpl;
import com.ak.pojo.Blog;
import com.ak.pojo.User;

@WebServlet("/addBlog")
public class AddBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        User user = (User) session.getAttribute("user");
        String title = req.getParameter("title");
        String content = req.getParameter("content");

        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setUserId(user.getId());

        try {
            BlogDao dao = new BlogDaoImpl();
            dao.add(blog);
            res.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("addBlog.jsp?error=1");
        }
    }
}