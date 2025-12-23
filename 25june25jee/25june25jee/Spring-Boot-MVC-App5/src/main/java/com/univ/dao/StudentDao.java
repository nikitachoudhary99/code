package com.univ.dao;

import java.util.List;

import com.univ.pojo.Student;

public interface StudentDao {

	boolean addStudent(Student s);
	boolean updateStudent(Student s);
	boolean deleteStudent(Student s);
	Student searchStudent(int roll);
	List<Student> getAllStudents();
}
