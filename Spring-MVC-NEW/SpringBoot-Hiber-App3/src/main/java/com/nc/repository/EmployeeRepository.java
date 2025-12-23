package com.nc.repository;

import org.springframework.data.repository.CrudRepository;

import com.nc.pojo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
