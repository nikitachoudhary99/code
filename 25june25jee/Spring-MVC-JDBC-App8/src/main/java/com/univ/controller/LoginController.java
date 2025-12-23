package com.univ.controller;

import java.io.Serial;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.univ.daoimpl.UserInfoDaoImpl;
import com.univ.pojo.UserInfo;

@Controller
public class LoginController {

	private UserInfoDaoImpl daoimpl;
	
	@Autowired
	public void setDaoimpl(UserInfoDaoImpl daoimpl) {
		this.daoimpl = daoimpl;
	}

	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
	}
	@GetMapping("/register")
	public String regPage(Model m)
	{
		UserInfo u = new UserInfo();
		m.addAttribute("userObj",u);
		return "reg";
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@PostMapping("/checkUser")
	public String checkUserCredential(UserInfo u,Model m,HttpServletRequest request)
	{
		
		if(daoimpl.checkUserCredential(u))
		{
			HttpSession session = request.getSession(false);
			if(session!=null)
			{
				session.invalidate();
			}
			session = request.getSession(true);
			session.setAttribute("username", u.getUsername());
			m.addAttribute("msg","Welcome TO Universal Informatics");
			return "home";
		}
		else
		{
			m.addAttribute("msg","Invalid Username / Password");
			return "login";
		}
	}
	
	@PostMapping("/addNewUser")
	public String addNewUser(@ModelAttribute("userObj")UserInfo u,Model m)
	{
		if(daoimpl.addNewUser(u))
		{
			m.addAttribute("msg","You Are Register Successfully, Can Login Here");
			return "login";
		}
		else
		{
			m.addAttribute("msg","You Are Could Not Be Register/Already Register");
			return "reg";
		}
	}
}
