package com.univ.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.univ.entities.Student;


public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// Save Student Info
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	

	// Get the Single Student
	public Student getStudent(int studentId) {
		return this.hibernateTemplate.get(Student.class, studentId);
	}

	// Get All the Student(All Rows)
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	// Delete the Students data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

	// Update The Student Info
	@Transactional
	public void updateStudent(Student studnet) {
		this.hibernateTemplate.update(studnet);
	}

	/*
	 * public int countTotalRecords() { String countQry =
	 * "SELECT COUNT(s.studentId) FROM studentdetails s"; Long count = (Long)
	 * hibernateTemplate.find(countQry).get(0); return count.intValue(); }
	 */

}