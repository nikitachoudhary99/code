package com.univ.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.univ.daoimpl.EmployeeDaoImpl;
import com.univ.pojo.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDaoImpl daoimpl;
	
	/*
	 * request method : GET
	 * url : localhost:8000/getall
	 */
	@GetMapping("/getall")
	public List<Employee> getAllEmp()
	{
		List<Employee> lst = daoimpl.getAllEmployee();
		return lst;
	}
	
	/*
	 * request method : POST
	 * url : localhost:8000/addemp
	 * json = 
	 * {
    	"empId": 103,
    	"empName": "Ankit Sharma",
    	"salary": 19000
  		}
	 * 
	 * Content-Type : application/json
	 * }
	 */
	@PostMapping("/addemp")
	public HashMap<String, String> addEmp(@RequestBody Employee e)
	{
		HashMap<String, String>hm = new HashMap<>();
		if(daoimpl.addEmployee(e))
			hm.put("Success", "Employee Added Successfully");
		else
			hm.put("Error", "Employee Could Not Be Added");
		
		return hm;
	}
	
	/*
	 * request method : PUT
	 * url : localhost:8000/updateemp
	 * json = 
	 * {
    	"empId": 103,
    	"empName": "Rahul Sharma",
    	"salary": 18000
  		}
	 * 
	 * Content-Type : application/json
	 * }
	 */
	@PutMapping("/updateemp")
	public HashMap<String, String> updateEmp(@RequestBody Employee e)
	{
		HashMap<String, String>hm = new HashMap<>();
		if(daoimpl.updateEmployee(e))
			hm.put("Success", "Employee Updated Successfully");
		else
			hm.put("Error", "Employee Could Not Be Updated");
		
		return hm;
	}
	
	/*
	 * request method : DELETE
	 * url : localhost:8000/delemp?id=1111
	 *
	 */
	@DeleteMapping("/delemp")
	public HashMap<String, String> updateEmp(@RequestParam("id")String eid)
	{
		int empid = Integer.parseInt(eid);
		HashMap<String, String>hm = new HashMap<>();
		if(daoimpl.deleteEmployee(empid))
			hm.put("Success", "Employee Deleted Successfully");
		else
			hm.put("Error", "Employee Could Not Be Deleted");
		
		return hm;
	}

	/*
	 * request method : DELETE
	 * url : localhost:8000/delemp?id=1111
	 *
	 */
	@GetMapping("/search")
	public @ResponseBody Employee searchEmp(@RequestParam("id")String eid)
	{
		int empid = Integer.parseInt(eid);
		HashMap<String, String>hm = new HashMap<>();
		Employee e =  daoimpl.searchEmployee(empid);
		if(e!=null)
			return e;
		else
			return null;
	}

	
}
