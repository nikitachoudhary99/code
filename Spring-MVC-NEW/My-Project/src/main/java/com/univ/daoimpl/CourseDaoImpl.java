package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.CourseDao;
import com.univ.pojo.Course;

@Component
public class CourseDaoImpl implements CourseDao {

    private JdbcTemplate jTemplate;

    @Autowired
    public void setjTemplate(JdbcTemplate jTemplate) {
        this.jTemplate = jTemplate;
    }

    // ✅ Save Course
    @Override
    public boolean saveCourse(Course course) {
        try {
            int count = jTemplate.update(
                "INSERT INTO course (id, courseName, description) VALUES (?, ?, ?)",
                new Object[]{course.getId(), course.getCourseName(), course.getDescription()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Get Course by ID
    @Override
    public Course getCourseById(int id) {
        try {
            return jTemplate.queryForObject(
                "SELECT * FROM course WHERE id = ?",
                new BeanPropertyRowMapper<>(Course.class),
                new Object[]{id}
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ✅ Get All Courses
    @Override
    public List<Course> getAllCourses() {
        List<Course> lst = new ArrayList<>();
        try {
            lst = jTemplate.query(
                "SELECT * FROM course",
                new BeanPropertyRowMapper<>(Course.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

    // ✅ Update Course
    @Override
    public boolean updateCourse(Course course) {
        try {
            int count = jTemplate.update(
                "UPDATE course SET courseName = ?, description = ? WHERE id = ?",
                new Object[]{course.getCourseName(), course.getDescription(), course.getId()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Delete Course
    @Override
    public boolean deleteCourse(int id) {
        try {
            int count = jTemplate.update(
                "DELETE FROM course WHERE id = ?",
                new Object[]{id}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
