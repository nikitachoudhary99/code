package com.ak.dao;

import com.ak.pojo.User;

public interface Userdao {
	  boolean register(User u);
	    boolean login(User u);
	    boolean updateProfile(User u);
}
