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
		return "login";
	}
	
	@PostMapping("/checkUser")
	public ModelAndView checkUserCredential(
			@RequestParam("username")String username,
			@RequestParam("password")String password)
	{
		ModelAndView mv = null;
		if(username.equals("abc@gmail.com")&&password.equals("abc@123"))
			mv = new ModelAndView("home","msg","Welcome TO Universal Informatics");
		else
			mv = new ModelAndView("login","msg","Invalid Username / Password");
		return mv;
	}
}
