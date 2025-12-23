package com.ak.dao.AdminDao;

import java.util.List;

import com.ak.pojo.User;

public interface AdminDao {
 boolean login(String email, String password);
 List<User> getAllUsers();
 boolean deleteUser(int id);
}
