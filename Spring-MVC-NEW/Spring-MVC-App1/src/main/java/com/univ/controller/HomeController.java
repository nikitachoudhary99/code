package com.univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	@RequestMapping(value="/checkUser",method=RequestMethod.POST)
	public ModelAndView checkUserCredeACntial(
			                        @RequestParam("username")String username,
			                        @RequestParam("password")String password)
	{ ModelAndView mv;
	if(username.equals("abc@gmail.com")&&password.equals("abc123"))
	{
		mv=new ModelAndView("Home","msg","welcome");
	}
	else
	{
		mv=new ModelAndView("Error","msg","invalid user");
	}
	return mv;
	
		
	}
}
