package com.ak.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ak.dao.UserInfoDao;
import com.ak.pojo.UserInfo;


@Controller
public class LoginController {

	
	private UserInfoDao daoimpl; 
	
	@Autowired
	public void setDaoimpl(UserInfoDao daoimpl) {
		this.daoimpl = daoimpl;
	}
	
	@GetMapping("/logout")
	public String logoutPage()
	{
		return "logout";
	}
	@RequestMapping("/index")
	public String indexPage1(Model m)
	{
		UserInfo user = new UserInfo();
		m.addAttribute("userObj",user);
		return "index";
	}
	@RequestMapping("/")
	public String indexPage(Model m)
	{
		UserInfo user = new UserInfo();
		m.addAttribute("userObj",user);
		return "index";
	}
	@RequestMapping("/registration")
	public String regPage(Model m)
	{
		UserInfo user = new UserInfo();
		m.addAttribute("userObj",user);
		return "reg";
	}
	@RequestMapping(value = "/checkuser",method = RequestMethod.POST)
	public String checkUser(@ModelAttribute("userObj")UserInfo user,Model m,
			HttpServletRequest request)
	{
		
		UserInfo user1 = new UserInfo();
		
		m.addAttribute("userObj",user1);
		if(daoimpl.checkUserCredential(user))
		{
			HttpSession session = request.getSession(false);
			if(session!=null)
			{
				session.invalidate();
			}
			session  = request.getSession(true);
			session.setAttribute("us", user.getUsername());
			
			m.addAttribute("username",user.getUsername());
			return "home";
		}
		else
		{
			m.addAttribute("msg","Invalid Username and Password");  
			return "index";

		}
	}
	@PostMapping("/adduser")
	public String addNewUser(@ModelAttribute("userObj")UserInfo user,Model m)
	{
		UserInfo user1 = new UserInfo();
		
		m.addAttribute("userObj",user1);
	
		if(daoimpl.addNewUser(user))
		{
			m.addAttribute("msg","User Register Successfylly , Can Login Here");
			return "index";
		}
		else
		{
			m.addAttribute("msg","User Could Not Be Register, Retry");
			return "reg";
		}
	}
}
