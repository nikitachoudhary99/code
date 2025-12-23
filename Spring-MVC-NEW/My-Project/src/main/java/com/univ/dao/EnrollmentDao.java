package com.univ.dao;

import java.util.List;

import com.univ.pojo.Enrollment;

public interface EnrollmentDao {
	boolean saveEnrollment(Enrollment enrollment);   // true/false
    Enrollment getEnrollmentById(int id);           // ek enrollment
    List<Enrollment> getAllEnrollments();           // list
    boolean updateEnrollment(Enrollment enrollment); // true/false
    boolean deleteEnrollment(int id);
}
