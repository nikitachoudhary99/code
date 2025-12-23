package com.nc.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nc.SpringBootHiberWebApp5Application;
import com.nc.dao.StudentDao;
import com.nc.pojo.Student;
import com.nc.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao {
	private final SpringBootHiberWebApp5Application app5Application;
	
	@Autowired
	private StudentRepository srepo; 
	

	public StudentDaoImpl(SpringBootHiberWebApp5Application app5Application) {
		this.app5Application=app5Application;
	}

	@Override
	public boolean addNewStudent(Student s) {
		try {
			srepo.save(s);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStudent(Student s) {
		try {
			Optional<Student> op= srepo.findById(s.getsId());
			if(op.isPresent())
			{
				srepo.save(s);
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	}

	@Override
	public boolean deleteStudent(int sId) {
		try {
			Optional<Student> op= srepo.findById(sId);
			if(op.isPresent())
			{
				srepo.deleteById(sId);
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		}

	@Override
	public Student searchStudent(int sId) {
		try {
			Optional<Student> op= srepo.findById(sId);
			if(op.isPresent())
			{
				
				return op.get();
			}
			else
			{
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public List<Student> getAllStudent() {
		try {
			List<Student> lst=(List<Student>)srepo.findAll();
			return lst;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		}
	
	

}
