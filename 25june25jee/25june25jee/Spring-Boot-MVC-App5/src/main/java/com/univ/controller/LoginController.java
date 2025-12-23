package com.univ.controller;

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

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	

	private UserInfoDao daoimpl;
	
	@Autowired
	public void setDaoimpl(UserInfoDao daoimpl) {
		this.daoimpl = daoimpl;
	}
	@GetMapping("/index")
	public String loginPage(Model m)
	{
		UserInfo user = new UserInfo();
		m.addAttribute("userObj",user);
		return "index";
	}
//	@RequestMapping("/")
//	public String indexPage(Model m)
//	{
//		UserInfo user = new UserInfo();
//		m.addAttribute("userObj",user);
//		return "index";
//	}
	@GetMapping("/reg")
	public String regPage(Model m)
	{
		UserInfo user = new UserInfo();
		m.addAttribute("userObj",user);
		return "reg";
	}
	@PostMapping("/checkuser")
	public String checkUser(@ModelAttribute("userObj")UserInfo user,
			ModelMap map, HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		session = request.getSession(true);
		if(daoimpl.checkUserCredential(user))
		{
			
			session.setAttribute("username", user.getUsername());
			
			return "home";
		}
		else
		{
			map.addAttribute("msg","Invalid Username / Password");
			return "index";
		}
	}
	
	@PostMapping("/addnewuser")
	public ModelAndView addNewUser(@ModelAttribute("userObj")UserInfo user)
	{
		ModelAndView mv=null;
		if(daoimpl.addNewUser(user)) 
		{
			mv = new ModelAndView("reg","msg","User Registrer Successfully");
		}
		else
		{
			mv = new ModelAndView("reg","msg","Username Already Exist");
		}
		return mv;
	}

}
