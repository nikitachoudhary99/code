package com.univ.dao;

import java.util.List;

import com.univ.pojo.Employee;

public interface EmployeeDao {
boolean addEmployee(Employee emp);
boolean updateEmployee(Employee emp);
boolean deleteEmployee(Employee emp);
Employee searchEmployee(int empId);
List<Employee> getAllEmployee();
}
