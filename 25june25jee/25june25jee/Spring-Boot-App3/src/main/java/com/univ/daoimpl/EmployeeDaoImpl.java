package com.univ.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.univ.SpringBootApp3Application;
import com.univ.dao.EmployeeDao;
import com.univ.pojo.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

    private final SpringBootApp3Application springBootApp3Application;

	private JdbcTemplate jTemplate;

    EmployeeDaoImpl(SpringBootApp3Application springBootApp3Application) {
        this.springBootApp3Application = springBootApp3Application;
    }
	@Autowired
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public boolean addEmployee(Employee e) {
		
		try {
			int count = jTemplate.update("insert into employee values(?,?,?)",
					new Object[] {e.getEmpId(),e.getEmpName(),e.getSalary()});
			if(count>0)
				return true;
			else
				return false;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee e) {
		try {
			int count = jTemplate.update("update employee set empName = ?,"
					+ " salary = ? where empId = ?",
					new Object[] {e.getEmpName(),e.getSalary(),e.getEmpId()});
			if(count>0)
				return true;
			else
				return false;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}
	
	

	@Override
	public boolean deleteEmployee(int eid) {
		try {
			int count = jTemplate.update("delete from employee"
					+ " where empId = ?",eid);
			if(count>0)
				return true;
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
			Employee emp = jTemplate.queryForObject("select * from employee"
					+ " where empId = ?", 
					new BeanPropertyRowMapper<Employee>(Employee.class),eid);
			return emp;
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
			List<Employee>lst = jTemplate.query("select * from employee", 
				new BeanPropertyRowMapper<Employee>(Employee.class));
			return lst;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
}
