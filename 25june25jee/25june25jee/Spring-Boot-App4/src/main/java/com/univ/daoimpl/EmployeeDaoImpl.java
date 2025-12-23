package com.univ.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.univ.SpringBootApp4Application;
import com.univ.dao.EmployeeDao;
import com.univ.pojo.Employee;
import com.univ.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private final SpringBootApp4Application springBootApp4Application;
    
    @Autowired
    private EmployeeRepository eRepository;

    EmployeeDaoImpl(SpringBootApp4Application springBootApp4Application) {
        this.springBootApp4Application = springBootApp4Application;
    }

	@Override
	public boolean addEmployee(Employee e) {
		try
		{
		
		eRepository.save(e);
		return true;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee e) {
		try {
			
			Optional<Employee>op = eRepository.findById(e.getEmpId());
			if(op.isPresent())
			{
				eRepository.save(e);
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}
	
	

	@Override
	public boolean deleteEmployee(int eid) {
		try {
			
			Optional<Employee>op = eRepository.findById(eid);
			if(op.isPresent())
			{
				eRepository.deleteById(eid);
				return true;
			}
			else
				return false;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee searchEmployee(int eid) {
		
		try {
			Optional<Employee>op = eRepository.findById(eid);
			if(op.isPresent())
				return op.get();
			else
				return null;
			
			}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		try {
			List<Employee>lst =(List<Employee>) eRepository.findAll();
			return lst;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
}
