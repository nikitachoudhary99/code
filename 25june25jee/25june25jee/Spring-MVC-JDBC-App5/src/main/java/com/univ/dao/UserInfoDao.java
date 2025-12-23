package com.univ.dao;

import com.univ.pojo.UserInfo;

public interface UserInfoDao {

	boolean checkUserCredential(UserInfo u);
	boolean addNewUser(UserInfo u);
}
