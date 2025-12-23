package com.ak.dao;

import com.ak.pojo.UserInfo;

public interface UserInfoDao {

	boolean checkUserCredential(UserInfo u);
	boolean addNewUser(UserInfo u);
}
