package com.nc.dao;

import java.util.List;

import com.nc.pojo.Employee;

public interface EmployeeDao {
	boolean addEmployee(Employee e);
	boolean updateEmployee(Employee e);
	boolean deleteEmployee(int empId);
	Employee getEmployee(int empId);
	List<Employee> getAllEmployee();
}
