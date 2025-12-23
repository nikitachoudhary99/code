package com.univ.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;

@Component
public class UserInfoDaoImpl implements UserInfoDao{

	private JdbcTemplate jTemplate;
	@Autowired
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public boolean checkUserCredential(UserInfo u) {
		
		List<UserInfo>lst = new ArrayList<>();
		try {
			lst = jTemplate.query("select * from userinfo where username = ?"
					+ " and password = ?", 
					new BeanPropertyRowMapper<UserInfo>(UserInfo.class),
					new Object[] {u.getUsername(),u.getPassword()});
			if(lst.size()>0)
				return true;
			else
				return false;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(UserInfo u) {
		
		try {
			int count = jTemplate.update("insert into userinfo "
					+ "where username = ? and password = ?",
					new Object[] {u.getUsername(),u.getPassword()});
			if(count>0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
