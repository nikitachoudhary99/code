package com.univ.dao;

import java.util.List;

import com.univ.pojo.Result;

public interface ResultDao {
	 void saveResult(Result result);
	    Result getResultById(int id);
	    List<Result> getAllResults();
	    void updateResult(Result result);
	    void deleteResult(int id);
}
