package com.blog.dao;

import com.blog.pojo.User;

public interface UserDao {
	
	 boolean registerUser(User user);
	 User login(String email, String password);
}
