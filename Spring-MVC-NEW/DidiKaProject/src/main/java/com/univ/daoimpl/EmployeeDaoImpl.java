package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.EmpDao;
import com.univ.pojo.Emplyee;

@Component
public class EmployeeDaoImpl implements EmpDao{
	
	
	@Autowired
	private JdbcTemplate jTemplate;
	
	@Override
	public boolean checkUser(Emplyee e) {
		try {
			e=jTemplate.queryForObject("select * from userinfo where username=? and password=?", new BeanPropertyRowMapper<Emplyee>(Emplyee.class),
					new Object[] {e.getUsername(),e.getPassword()});
			if(e!=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addUser(Emplyee e) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
