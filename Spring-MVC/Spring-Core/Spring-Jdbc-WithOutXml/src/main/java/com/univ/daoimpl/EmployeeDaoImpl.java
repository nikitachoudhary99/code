package com.univ.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.univ.dao.EmployeeDao;
import com.univ.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
 
	private JdbcTemplate jTemplate;

	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		try {
		int count=jTemplate.update("insert into employee values(?,?,?)",
				new Object[] {emp.getEmpId(), emp.getEmpName(),emp.getSalary()});
		if(count>0)
			return true;
		else
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		try {
			int count=jTemplate.update("update employee set empName=?,salary=? where empId=?",
					new Object[] {emp.getEmpName(),emp.getSalary(),emp.getEmpId()});
			return (count>0);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(Employee emp) {
		try {
			int count=jTemplate.update("delete from employee where empId=?",emp.getEmpId());
			if(count>0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee searchEmployee(int empId) {
		try {
			List<Employee> lst=jTemplate.query("select * from employee where empId=?",
					new BeanPropertyRowMapper<Employee>(Employee.class),empId);
			if(lst.size()>0)
				return lst.get(0);
			else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		try {
			List<Employee>lst=jTemplate.query("select * from employee",
					new BeanPropertyRowMapper<Employee>(Employee.class));
			if(lst.size()>0)
				return lst;
			else
				return null;
					
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
