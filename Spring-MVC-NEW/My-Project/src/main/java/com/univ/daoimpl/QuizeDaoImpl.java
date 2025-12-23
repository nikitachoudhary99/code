package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.QuizeDao;
import com.univ.pojo.Quize;

@Component
public class QuizeDaoImpl implements QuizeDao {

    private JdbcTemplate jTemplate;

    @Autowired
    public void setjTemplate(JdbcTemplate jTemplate) {
        this.jTemplate = jTemplate;
    }

    // ✅ Save Quiz
    @Override
    public boolean saveQuiz(Quize quiz) {
        try {
            int count = jTemplate.update(
                "INSERT INTO quiz (id, courseId, question, options, correctAnswer) VALUES (?, ?,  ?, ?)",
                new Object[]{quiz.getId(), quiz.getCourse(), quiz.getQuestion(), quiz.getCorrectAnswer()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Get Quiz by ID
    @Override
    public Quize getQuizById(int id) {
        try {
            return jTemplate.queryForObject(
                "SELECT * FROM quiz WHERE id = ?",
                new BeanPropertyRowMapper<>(Quize.class),
                new Object[]{id}
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null; // not found
        }
    }

    // ✅ Get All Quizzes
    @Override
    public List<Quize> getAllQuizzes() {
        List<Quize> list = new ArrayList<>();
        try {
            list = jTemplate.query(
                "SELECT * FROM quiz",
                new BeanPropertyRowMapper<>(Quize.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // ✅ Update Quiz
    @Override
    public boolean updateQuiz(Quize quiz) {
        try {
            int count = jTemplate.update(
                "UPDATE quiz SET courseId = ?, question = ?,  correctAnswer = ? WHERE id = ?",
                new Object[]{quiz.getCourse(), quiz.getQuestion(), quiz.getCorrectAnswer(), quiz.getId()}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Delete Quiz
    @Override
    public boolean deleteQuiz(int id) {
        try {
            int count = jTemplate.update(
                "DELETE FROM quiz WHERE id = ?",
                new Object[]{id}
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
