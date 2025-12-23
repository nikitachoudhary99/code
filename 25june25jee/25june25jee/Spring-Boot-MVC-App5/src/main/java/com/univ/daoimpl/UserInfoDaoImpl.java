package com.univ.daoimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;
import com.univ.repository.UserInfoRepository;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@Autowired
	private UserInfoRepository infoRepository;

	@Override
	public boolean checkUserCredential(UserInfo u) {
		boolean isValid=false;
		try {
			Optional<UserInfo>op = infoRepository.findById(u.getUsername());
			if(op.isPresent())
			{
				UserInfo user = op.get();
				if(u.getPassword().equals(user.getPassword()))
				{
				isValid = true;
				}
				else
				{
					isValid = false;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			isValid =  false;
		}
		return isValid;
	}

	@Override
	public boolean addNewUser(UserInfo u) {
	
		try {
				infoRepository.save(u);
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
