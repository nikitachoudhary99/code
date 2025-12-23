package com.univ.controller;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private UserInfoDao userInfoDao;

    // ---------- LOGIN PAGE ----------
    @GetMapping({"/", "/login"})
    public String loginPage() {
        return "login"; // login.jsp
    }

    // ---------- LOGIN ----------
    @PostMapping("/checkUser")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {

        UserInfo u = new UserInfo();
        u.setUsername(username);
        u.setPassword(password);

        UserInfo user = userInfoDao.checkUserCredential(u);

        if (user != null) {
            session.setAttribute("username", user.getUsername());
            session.setAttribute("role", user.getRole());

            model.addAttribute("message", "Welcome " + user.getUsername());

            // Redirect based on role
            if ("ADMIN".equalsIgnoreCase(user.getRole())) {
                return "adminHome"; // adminHome.jsp
            } else {
                return "home"; // home.jsp for normal user
            }
        } else {
            model.addAttribute("message", "Invalid username/password!");
            return "login";
        }
    }

    // ---------- USER REGISTER PAGE ----------
    @GetMapping("/register")
    public String registerPage() {
        return "register"; // register.jsp
    }

    // ---------- NORMAL USER REGISTRATION ----------
    @PostMapping("/saveUser")
    public String saveUser(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("role") String role,
                           Model model) {

        UserInfo u = new UserInfo();
        u.setUsername(username);
        u.setPassword(password);
        u.setRole(role);  // Default role

        if (userInfoDao.addNewUser(u)) {
            model.addAttribute("message", "Registration successful! Please login.");
            return "login";
        } else {
            model.addAttribute("message", "Username already exists!");
            return "register";
        }
    }

    // ---------- FORGOT PASSWORD PAGE ----------
    @GetMapping("/forgotpassword")
    public String forgotPasswordPage() {
        return "forgotPassword"; // forgotPassword.jsp
    }

    // ---------- UPDATE PASSWORD ----------
    @PostMapping("/updatepasswords")
    public ModelAndView forgotPassword(@RequestParam("username") String username,
                                       @RequestParam("newPassword") String newPassword,
                                       @RequestParam("confirmPassword") String confirmPassword) {

        if (!newPassword.equals(confirmPassword)) {
            return new ModelAndView("forgotPassword", "message", "Passwords do not match!");
        }

        UserInfo u = new UserInfo();
        u.setUsername(username);
        u.setPassword(newPassword);

        boolean updated = userInfoDao.updatepassword(u);

        if (updated) {
            return new ModelAndView("login", "message", "Password updated successfully! Please login.");
        } else {
            return new ModelAndView("forgotPassword", "message", "Username not found or update failed!");
        }
    }

    // ---------- BACK BUTTON ----------
    @GetMapping("/backL")
    public String backToHome(HttpSession session) {
        String role = (String) session.getAttribute("role");

        if (role == null) {
            return "login"; // No session → go back to login
        }

        if ("ADMIN".equalsIgnoreCase(role)) {
            return "adminHome"; // adminHome.jsp
        } else {
            return "home"; // home.jsp
        }
    }

    // ---------- LOGOUT ----------
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
