package com.nc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nc.daoimpl.StudentDaoImpl;

import com.nc.pojo.Student;

@RestController

public class StudentController {
	@Autowired
    private StudentDaoImpl impl;

    // Get all students
    @GetMapping("/getAll")
    public List<Student> getAll() {
        return impl.getAllStudent();
    }

    // Add new student
    @PostMapping("/add")
    public Student addStud(@RequestBody Student s) {
        if (impl.addNewStudent(s)) {
            return s; // return the student object (successfully added)
        } else {
            return null; // or throw an exception (better option)
        }
    }

    // Update student
    @PutMapping("/update")
    public Student updateStud(@RequestBody Student s) {
        if (impl.updateStudent(s)) {
            return s; // updated student
        } else {
            return null; // or throw exception
        }
    }

    // Delete student
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        if (impl.deleteStudent(id)) {
            return "Student deleted successfully";
        } else {
            return "Student could not be deleted";
        }
    }

    // Search student by id
    @GetMapping("/search")
    public Student getStudent(@RequestParam("id") int id) {
        return impl.searchStudent(id);
    }
}
