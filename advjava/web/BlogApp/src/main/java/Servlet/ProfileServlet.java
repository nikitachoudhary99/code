package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ak.dao.Userdao;
import com.ak.daoimpl.UserDaoImpl;
import com.ak.pojo.User;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            req.getRequestDispatcher("profile.jsp").forward(req, res);
        } else {
            res.sendRedirect("login.jsp");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        User user = (User) session.getAttribute("user");
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));

        try {
            Userdao dao = new UserDaoImpl();
            dao.updateProfile(user);
            session.setAttribute("user", user);
            res.sendRedirect("profile.jsp?success=1");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("profile.jsp?error=1");
        }
    }
}