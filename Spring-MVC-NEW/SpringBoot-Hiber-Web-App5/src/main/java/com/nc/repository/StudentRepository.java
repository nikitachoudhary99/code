package com.nc.repository;
import org.springframework.data.repository.CrudRepository;

import com.nc.pojo.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
