package com.ak.dao;

import com.ak.pojo.userinfo;

public interface userinfodao {

	boolean checkUserCredential(userinfo u);
	boolean addNewUser(userinfo u);
}
