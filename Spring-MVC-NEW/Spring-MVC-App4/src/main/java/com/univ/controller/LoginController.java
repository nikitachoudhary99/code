package com.univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String checkUserCridential(      @RequestParam("username")String username,
											@RequestParam("password")String password,Model m)
	{
		
		if(username.equals("abc@123gmail.com")&&password.equals("abc123"))
		{	
			m.addAttribute("msg","welcome to new IT world");
			return "Home";
		}
		else
			m.addAttribute("msg","Invalid user");
		return "Login";
			
	}
}
