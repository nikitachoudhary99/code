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

@WebServlet("/editBlog")
public class EditBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String content = req.getParameter("content");

        try {
            BlogDao dao = new BlogDaoImpl();
            Blog blog = dao.getById(id);
            if (blog.getUserId() == ((User) session.getAttribute("user")).getId()) {
                blog.setTitle(title);
                blog.setContent(content);
                dao.update(blog);
            }
            res.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("editBlog.jsp?error=1");
        }
    }
}
