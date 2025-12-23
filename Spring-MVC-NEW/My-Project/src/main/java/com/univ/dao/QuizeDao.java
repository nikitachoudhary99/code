package com.univ.dao;

import java.util.List;

import com.univ.pojo.Quize;

public interface QuizeDao {
	boolean saveQuiz(Quize quiz);        // true/false
    Quize getQuizById(int id);           // single quiz
    List<Quize> getAllQuizzes();         // list of quizzes
    boolean updateQuiz(Quize quiz);      // true/false
    boolean deleteQuiz(int id); 
}
