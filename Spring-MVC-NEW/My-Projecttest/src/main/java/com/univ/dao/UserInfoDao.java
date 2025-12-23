package com.univ.dao;

import com.univ.pojo.UserInfo;

public interface UserInfoDao {
	UserInfo checkUserCredential(UserInfo u);
	boolean addNewUser(UserInfo u);
	boolean addNewPassword(UserInfo u);
	boolean updatepassword(UserInfo u);
	
}
