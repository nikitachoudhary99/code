package com.univ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.univ.dao.EmpDao;
import com.univ.pojo.Emplyee;

@Controller
public class UserLoginController {
	@Autowired
	private EmpDao daoimpl;
	
	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("checkUser")
	public ModelAndView checkUser(Emplyee e) {
		ModelAndView mv=null;
		try {
			if(daoimpl.checkUser(e)) {
				mv=new ModelAndView("home","msg","Welc ome bhiya");
			}else {
				mv=new ModelAndView("index","msg","Invalid User");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return mv;
	}
}
