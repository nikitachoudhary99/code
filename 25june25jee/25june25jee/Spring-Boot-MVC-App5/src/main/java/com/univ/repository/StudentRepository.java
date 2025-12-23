package com.univ.repository;

import org.springframework.data.repository.CrudRepository;

import com.univ.pojo.Student;



public interface StudentRepository extends CrudRepository<Student, Integer>{

}
