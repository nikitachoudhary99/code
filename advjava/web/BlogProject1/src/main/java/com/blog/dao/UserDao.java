package com.blog.dao;

import com.blog.pojo.User;

public interface UserDao {
	
	
	 boolean checkuser(User u);
	 boolean addUser(User u);
}
