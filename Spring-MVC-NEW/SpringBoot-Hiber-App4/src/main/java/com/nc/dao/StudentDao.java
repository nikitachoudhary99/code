package com.nc.dao;

import java.util.List;

import com.nc.pojo.Student;

public interface StudentDao {

	boolean addNewStudent(Student s);
	boolean updateStudent(Student s);
	boolean deleteStudent(int sId);
	Student searchStudent(int sId);
	List<Student> getAllStudent();
	
}
