package com.blog.daoimpl;

import java.sql.*;
import com.blog.dao.UserDao;
import com.blog.pojo.User;

public class UserDaoImpl implements UserDao {
	
	Connection con = null;
	public UserDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blogmng?user=root&password=mishthu99");
		} 
		catch (Exception e) 
		{
			System.out.println("Error in loading drivers and making connection");
		}
	}
	
	@Override
	public boolean checkuser(User u) {
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE email=?");
			ps.setString(1, u.getEmail());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean addUser(User u) {
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO user (name, email, password) VALUES (?, ?, ?)");
			 
	            ps.setString(1, u.getName());
	            ps.setString(2, u.getEmail());
	            ps.setString(3, u.getPassword());
	            ResultSet rs = ps.executeQuery();
			if(rs.next()==true) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
