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
		return "login";
	}
	
	@PostMapping("/checkUser")
	public String checkUserCredential(
			@RequestParam("username")String username,
			@RequestParam("password")String password,Model m)
	{
		
		if(username.equals("abc@gmail.com")&&password.equals("abc@123"))
		{
			m.addAttribute("msg","Welcome TO Universal Informatics");
			return "home";
		}
		else
		{
			m.addAttribute("msg","Invalid Username / Password");
			return "login";
		}
	}
}
