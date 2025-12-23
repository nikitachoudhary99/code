package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.EnrollmentDao;
import com.univ.pojo.Enrollment;

@Component
public class EnrollmentDaoImpl implements EnrollmentDao {

    private JdbcTemplate jTemplate;

    @Autowired
    public void setjTemplate(JdbcTemplate jTemplate) {
        this.jTemplate = jTemplate;
    }

    // ✅ Save Enrollment
    @Override
    public boolean saveEnrollment(Enrollment enrollment) {
        try {
            int count = jTemplate.update(
                "INSERT INTO enrollment (id, studentId, courseId) VALUES (?, ?, ?)",
                new Object[]{enrollment.getId(), enrollment.getStudentId(), enrollment.getCourseId()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Get Enrollment by ID
    @Override
    public Enrollment getEnrollmentById(int id) {
        try {
            return jTemplate.queryForObject(
                "SELECT * FROM enrollment WHERE id = ?",
                new BeanPropertyRowMapper<>(Enrollment.class),
                new Object[]{id}
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ✅ Get All Enrollments
    @Override
    public List<Enrollment> getAllEnrollments() {
        List<Enrollment> list = new ArrayList<>();
        try {
            list = jTemplate.query(
                "SELECT * FROM enrollment",
                new BeanPropertyRowMapper<>(Enrollment.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // ✅ Update Enrollment
    @Override
    public boolean updateEnrollment(Enrollment enrollment) {
        try {
            int count = jTemplate.update(
                "UPDATE enrollment SET studentId = ?, courseId = ? WHERE id = ?",
                new Object[]{enrollment.getStudentId(), enrollment.getCourseId(), enrollment.getId()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Delete Enrollment
    @Override
    public boolean deleteEnrollment(int id) {
        try {
            int count = jTemplate.update(
                "DELETE FROM enrollment WHERE id = ?",
                new Object[]{id}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
