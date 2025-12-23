package com.univ.dao;

import java.util.List;

import com.univ.pojo.Course;

public interface CourseDao {
	  boolean saveCourse(Course course);   // return true/false
	    Course getCourseById(int id);
	    List<Course> getAllCourses();
	    boolean updateCourse(Course course); // return true/false
	    boolean deleteCourse(int id); 
}
