package com.univ.dao;

import java.util.List;

import com.univ.pojo.Employee;

public interface EmployeeDao {

	
	boolean addEmployee(Employee e);
   boolean updateEmployee(Employee e);
   boolean deleteEmployee(Employee e);
   Employee searchEmployee(int empId);
   List<Employee> getAllEmployee();

}
