package com.univ.dao;

import java.util.List;

import com.univ.pojo.Course;

public interface CourseDao {
	 boolean addCourse(Course course);
	    boolean updateCourse(Course course);
	    boolean deleteCourse(Course course);
	    Course searchCourse(int id);
	    List<Course> getAllCourses();
}
