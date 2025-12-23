package com.univ.controller;

import com.univ.dao.AdminDao;
import com.univ.pojo.AdminInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminDao adminDao;

    // ---------- LOGIN PAGE ----------
    @GetMapping("/login")
    public String adminLoginPage() {
        return "login"; // ✅ login.jsp
    }

    // ---------- LOGIN ----------
    @PostMapping("/checkAdmin")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {

        AdminInfo a = new AdminInfo();
        a.setUsername(username);
        a.setPassword(password);

        AdminInfo admin = adminDao.checkAdminCredential(a);

        if (admin != null) {
            session.setAttribute("username", admin.getUsername());
            session.setAttribute("role", "ADMIN");

            model.addAttribute("message", "Welcome Admin " + admin.getUsername());
            return "admin-home"; // ✅ admin-home.jsp (dashboard page)
        } else {
            model.addAttribute("message", "Invalid admin credentials!");
            return "login";
        }
    }

    // ---------- REGISTER ADMIN ----------
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/saveAdmin")
    public String saveAdmin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            Model model) {

        AdminInfo a = new AdminInfo();
        a.setUsername(username);
        a.setPassword(password);
        a.setRole("ADMIN");

        if (adminDao.addNewAdmin(a)) {
            model.addAttribute("message", "Admin registered successfully!");
            return "login";
        } else {
            model.addAttribute("message", "Admin already exists!");
            return "register";
        }
    }

    // ---------- FORGOT PASSWORD ----------
    @GetMapping("/forgotpassword")
    public String forgotPasswordPage() {
        return "forgotpassword";
    }

    @PostMapping("/updatepasswords")
    public ModelAndView forgotPassword(@RequestParam("username") String username,
                                       @RequestParam("newPassword") String newPassword,
                                       @RequestParam("confirmPassword") String confirmPassword) {

        if (!newPassword.equals(confirmPassword)) {
            return new ModelAndView("forgotpassword", "message", "Passwords do not match!");
        }

        AdminInfo a = new AdminInfo();
        a.setUsername(username);
        a.setPassword(newPassword);

        boolean updated = adminDao.updateAdminPassword(a);

        if (updated) {
            return new ModelAndView("login", "message", "Password updated successfully! Please login.");
        } else {
            return new ModelAndView("forgotpassword", "message", "Admin not found or update failed!");
        }
    }

    // ---------- ADMIN HOME (Dashboard) ----------
    @GetMapping("/home")
    public String adminHome(HttpSession session, Model model) {
        if (session.getAttribute("username") == null) {
            return "redirect:/admin/login";
        }
        model.addAttribute("message", "Welcome to Admin Dashboard!");
        return "admin-home"; // ✅ admin-home.jsp
    }

    // ---------- MANAGE USERS ----------
    @GetMapping("/manageUsers")
    public String manageUsersPage() {
        return "manageUsers"; // ✅ manageUsers.jsp
    }

    // ---------- QUIZ PAGE ----------
    @GetMapping("/quiz")
    public String quizPage() {
        return "quiz"; // ✅ quiz.jsp
    }

    // ---------- ADD / UPDATE / DELETE QUIZ ----------
    @GetMapping("/amdQuize")
    public String addUpdateDeleteQuizPage() {
        return "amdQuize"; // ✅ amdQuize.jsp
    }

    // ---------- LOGOUT ----------
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
