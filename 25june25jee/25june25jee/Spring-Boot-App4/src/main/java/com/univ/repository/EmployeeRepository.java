package com.univ.repository;

import org.springframework.data.repository.CrudRepository;

import com.univ.pojo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
