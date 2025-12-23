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

    // --------- LOGIN PAGE ----------
    @RequestMapping("/")
    public String indexPage() {
        return "login";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/checkUser")
    public String home(Model model, UserInfo u, HttpSession session) {
        if (userInfoDao.checkUserCredential(u)) {
            session.setAttribute("username", u.getUsername());
            model.addAttribute("message", "Welcome to home page");
            return "home";
        } else {
            model.addAttribute("message", "Invalid username/password");
            return "login";
        }
    }

    // --------- REGISTER PAGE ----------
    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           Model model, HttpSession session) {
        UserInfo u = new UserInfo();
        u.setUsername(username);
        u.setPassword(password);

        if (userInfoDao.addNewUser(u)) {
            session.setAttribute("username", u.getUsername());
            model.addAttribute("message", "Welcome to Login page");
            return "login";
        } else {
            model.addAttribute("message", "User could not be registered!");
            return "register";
        }
    }

    // --------- FORGOT PASSWORD PAGE ----------
    @RequestMapping("/forgotPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }

    @RequestMapping("/backL")
    public String backL() {
    	return "login";
    }
    
    // --------- CHANGE PASSWORD ----------
    @PostMapping("/changePassword")
    public ModelAndView changePassword(
                                 @RequestParam("newPassword") String newPassword,
                                 @RequestParam("confirmPassword") String confirmPassword,
                                 HttpSession session) {
    	ModelAndView mv=null;

        String username = (String) session.getAttribute("username");
        
        if (username == null) {
            mv=new ModelAndView("login","message", "You must be logged in to change password!");
        }

        if (!newPassword.equals(confirmPassword)) {
        	mv=new ModelAndView("changePassword","message", "New password and confirm password do not match!");
        }
        return mv;
    }
   
}
