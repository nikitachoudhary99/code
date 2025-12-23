package com.univ.dao;

import com.univ.pojo.Emplyee;

public interface EmpDao {
	boolean checkUser(Emplyee e);
	boolean addUser(Emplyee e);
}
