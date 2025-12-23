package com.univ.controller;

import java.io.File;
import java.io.Serial;

import javax.servlet.annotation.MultipartConfig;
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
import org.springframework.web.multipart.MultipartFile;
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
	@RequestMapping("/logout")
	public String logoutPage(HttpServletRequest request)
	{
		int x=5;
		HttpSession session = request.getSession(false);
		session.setAttribute("x", x);
		return "logout";
	}
	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
	}
	@GetMapping("/reg")
	public String regPage()
	{
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
		UserInfo user = daoimpl.checkUserCredential(u);
		
		if(user!=null)
		{
			HttpSession session = request.getSession(false);
			if(session!=null)
			{
				session.invalidate();
			}
			session = request.getSession(true);
			session.setAttribute("username", u.getUsername());
			session.setAttribute("dp", u.getDp());
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
	public String addnewUser(@RequestParam("username")String user,
			@RequestParam("password")String pass,
			@RequestParam("dp")MultipartFile file,Model m)throws Exception
	{
		UserInfo u = new UserInfo();
		u.setUsername(user);
		u.setPassword(pass);
		String dp = file.getOriginalFilename();
		u.setDp(dp);
		String destpath = "/home/administrator/My_Drive/25june25jee/Spring MVC/Spring-Hibernate-App99/src/main/webapp/resources/images/";
		
		File serverfile = new File(destpath,file.getOriginalFilename());
		System.out.println(serverfile);
		file.transferTo(serverfile);
		
		System.out.println(u);
		if(daoimpl.addNewUser(u))
		{
			m.addAttribute("msg","USer Register Successfully, Can Login Here");
			return "login";
		}
		else
		{
			m.addAttribute("msg","User Could Not Be Register");
			return "reg";
		}
		
	}
	
}
