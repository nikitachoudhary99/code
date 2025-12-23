package com.univ.daoimpl;

import org.springframework.stereotype.Component;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;

@Component
public class UserInfoDaoImpl implements UserInfoDao{

	@Override
	public boolean checkUserCredential(UserInfo u) {
		
		if(u.getUsername().equals("abc@gmail.com")&&u.getPassword().equals("abc@123"))
			return true;
		else
			return false;
	}

	@Override
	public boolean addNewUser(UserInfo u) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
