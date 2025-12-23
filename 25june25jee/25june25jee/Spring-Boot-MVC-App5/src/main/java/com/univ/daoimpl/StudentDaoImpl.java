package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.univ.dao.StudentDao;
import com.univ.pojo.Student;
import com.univ.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private StudentRepository repository;
	
	@Override
	public boolean addStudent(Student s) {
		
		try {
			repository.save(s);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStudent(Student s) {
		try {
			Optional<Student>op = repository.findById(s.getRoll());
			if(op.isPresent())
			{
				repository.save(s);
				return true;
			}
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStudent(Student s) {
		try {
			Optional<Student>op = repository.findById(s.getRoll());
			if(op.isPresent())
			{
				repository.deleteById(s.getRoll());
				return true;
			}
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Student searchStudent(int roll) {
		
		try {
			Optional<Student>op = repository.findById(roll);
			if(op.isPresent())
				return op.get();
			else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public List<Student> getAllStudents() {
		
		List<Student>lst = new ArrayList<>();
		try {
			repository.findAll().forEach(lst::add);
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}
		
	}
}
