package com.univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String indexPage()
	{
		return "Login";
	}
	@PostMapping("/checkUser")
	public ModelAndView checkUserCridential(
											@RequestParam("username")String username,
											@RequestParam("password")String password)
	{
		ModelAndView mv;
		if(username.equals("abc@123gmail.com")&&password.equals("abc123"))
			mv=new ModelAndView("Home","msg","welcome to new IT world");
		else
			mv=new ModelAndView("Login","msg","Invalid user");
		return mv;
			
	}
}
