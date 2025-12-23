package com.nc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nc.SpringBootApp2Application;
import com.nc.daoimpl.EmployeeDaoImpl;
import com.nc.pojo.Employee;

@RestController
public class EmployeeController {

    private final SpringBootApp2Application springBootApp2Application;
	@Autowired
	private EmployeeDaoImpl daoimpl;

    EmployeeController(SpringBootApp2Application springBootApp2Application) {
        this.springBootApp2Application = springBootApp2Application;
    }
	
	/*
	 * localhost:8000/getAll
	 * {"empId":104,"empName":"Seeta Ram Ji","salary":53000.0}
	 */
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		List<Employee> lst=daoimpl.getAllEmployee();
		return lst;
	}
	
	/*
	 * localhost:8000/addNewEmp
	 * content-type - application/json
	 * {"empId":104,"empName":"Seeta Ram Ji","salary":53000.0}
	 */
	@PostMapping("/addNewEmp")
	public HashMap<String, String> addEmplo(@RequestBody Employee e){
		HashMap<String, String> hm=new HashMap<String, String>();
		if(daoimpl.addEmployee(e)) {
			hm.put("Success", "Employee Added Successfully");
		}else {
			hm.put("Error", "Employee does not Addded");
		}
		return hm;
	}
	
	@PutMapping("/updateEmp")
	public HashMap<String, String> updateEmployee(@RequestBody Employee e){
		HashMap<String, String> hm=new HashMap<String, String>();
		if(daoimpl.updateEmployee(e)) {
			hm.put("Success", "Employee Updated Successfully");
		}else {
			hm.put("Error", "Employee does not Update");
		}
		return hm;
	}
	
	@DeleteMapping("/deleteEmp")
	public HashMap<String, String> deleteEmployee(@RequestParam("id")String eId){
		HashMap<String, String> hm=new HashMap<String, String>();
		int empId=Integer.parseInt(eId);
		if(daoimpl.deleteEmployee(empId)) {
			hm.put("Success", "Employee deleted Successfully");
		}else {
			hm.put("Error", "Employee does not deleted");
		}
		return hm;
	}
	
	@GetMapping("/getEmp")
	public Employee getEmployee(@RequestParam("id")String eId) {
		int empId=Integer.parseInt(eId);
		Employee e=daoimpl.getEmployee(empId);
		return e;
	}
}
