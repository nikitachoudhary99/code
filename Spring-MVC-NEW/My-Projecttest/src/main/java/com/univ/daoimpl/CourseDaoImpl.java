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

    // ✅ Add Course
    @Override
    public boolean addCourse(Course c) {
        try {
            int count = jTemplate.update("INSERT INTO course VALUES (?, ?, ?)",
                    new Object[]{c.getId(), c.getCourseName(), c.getDescription()});
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Update Course
    @Override
    public boolean updateCourse(Course c) {
        try {
            int count = jTemplate.update("UPDATE course SET courseName=?, description=? WHERE id=?",
                    new Object[]{c.getCourseName(), c.getDescription(), c.getId()});
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Delete Course
    @Override
    public boolean deleteCourse(Course c) {
        try {
            int count = jTemplate.update("DELETE FROM course WHERE id=?",c.getId());
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Search Course by Id
    @Override
    public Course searchCourse(int id) {
        try {
            return jTemplate.queryForObject("SELECT * FROM course WHERE id=?",
                    new BeanPropertyRowMapper<>(Course.class), id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ✅ Get all Courses
    @Override
    public List<Course> getAllCourses() {
        List<Course> list = new ArrayList<>();
        try {
            list = jTemplate.query("SELECT * FROM course",
                    new BeanPropertyRowMapper<>(Course.class));
            if (list.size() > 0)
                return list;
            else
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
