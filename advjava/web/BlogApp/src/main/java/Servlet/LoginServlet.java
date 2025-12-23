package Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ak.dao.Userdao;
import com.ak.daoimpl.UserDaoImpl;
import com.ak.pojo.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            User u = new User();
            u.setEmail(email);
            u.setPassword(password);

            Userdao dao = new UserDaoImpl();
            boolean isValid = dao.login(u);

            if (isValid) {
                HttpSession session = req.getSession();
                session.setAttribute("user", u);
                res.sendRedirect("index.jsp");
            } else {
                res.sendRedirect("login.jsp?error=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("login.jsp?error=1");
        }
    }
}
