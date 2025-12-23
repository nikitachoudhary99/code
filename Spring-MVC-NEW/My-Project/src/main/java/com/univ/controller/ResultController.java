package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.univ.dao.ResultDao;
import com.univ.pojo.Result;

@Controller
@RequestMapping("/results")
public class ResultController {
	 @Autowired
	    private ResultDao resultDao;

	    // ✅ Save Result
	    @PostMapping("/save")
	    public String saveResult(@RequestBody Result result) {
	        resultDao.saveResult(result);
	        return "Result saved successfully!";
	    }

	    // ✅ Get Result by ID
	    @GetMapping("/{id}")
	    public Result getResultById(@PathVariable int id) {
	        return resultDao.getResultById(id);
	    }

	    // ✅ Get All Results
	    @GetMapping("/all")
	    public List<Result> getAllResults() {
	        return resultDao.getAllResults();
	    }

	    // ✅ Update Result
	    @PutMapping("/update")
	    public String updateResult(@RequestBody Result result) {
	        resultDao.updateResult(result);
	        return "Result updated successfully!";
	    }

	    // ✅ Delete Result
	    @DeleteMapping("/delete/{id}")
	    public String deleteResult(@PathVariable int id) {
	        resultDao.deleteResult(id);
	        return "Result deleted successfully!";
	    }

}
