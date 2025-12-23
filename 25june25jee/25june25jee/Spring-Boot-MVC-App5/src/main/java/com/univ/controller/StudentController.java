package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.univ.dao.StudentDao;
import com.univ.pojo.Student;

@Controller
public class StudentController 
{
	private StudentDao daoimpl;
	@Autowired
	public void setDaoimpl(StudentDao daoimpl) {
		this.daoimpl = daoimpl;
	}
	@GetMapping("/home")
	public String studHome()
	{
		return "home";
	}
	
	@GetMapping("/amdstudent")
	public String studentIndex()
	{
		return "amdstudent";
	}
	
	@PostMapping("/savestudent")
	public ModelAndView saveStudent(@RequestParam("roll") String roll,
									@RequestParam("name")String name,
									@RequestParam("marks")String marks,
									@RequestParam("op")String op)
	{
		ModelAndView mv = null;
		Student s = new Student();
		s.setRoll(Integer.parseInt(roll));
		s.setName(name);
		s.setMarks(Double.parseDouble(marks));
		if(op.equals("Add"))
		{
			if(daoimpl.addStudent(s))
			{
				mv = new ModelAndView("amdstudent","msg","Student Added Successfully");
			}
			else
			{
				mv = new ModelAndView("amdstudent","msg","Student Could Not be Added ");
			}
		}
		if(op.equals("Update"))
		{
			if(daoimpl.updateStudent(s))
			{
				mv = new ModelAndView("amdstudent","msg","Student Updated Successfully");
			}
			else
			{
				mv = new ModelAndView("amdstudent","msg","Student Could Not be Updated ");
			}
		}
		if(op.equals("Delete"))
		{
			if(daoimpl.deleteStudent(s))
			{
				mv = new ModelAndView("amdstudent","msg","Student Deleted Successfully");
			}
			else
			{
				mv = new ModelAndView("amdstudent","msg","Student Could Not be Deleted ");
			}
		}
		return mv;

	}	
	
	@GetMapping("/getall")
	public ModelAndView getAllStud()
	{
		ModelAndView mv =null;
		List<Student>lst = daoimpl.getAllStudents();
		mv = new ModelAndView("listofstudents","allstudents",lst);
		return mv;
	}
	
	
}
