package com.ak.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ak.dao.UserInfoDao;
import com.ak.pojo.UserInfo;

public class UserInfoDaoImpl implements UserInfoDao 
{

	Connection con = null;
	public UserInfoDaoImpl() {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
			+ "30apr25ad?user=root&password=root");
		}
		catch (Exception e) 
		{
			System.out.println("Error in loading drivers and making connection");
		}
	}

	@Override
	public boolean checkUserCredential(UserInfo u) {
		boolean isValid=false;
		try {
			PreparedStatement ps = con.prepareStatement("select * from"
				+ " userinfo where username = ? and password = ?");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				isValid = true;
			}
			else
			{
				isValid = false;
			}
			
		}
		catch (Exception e) 
		{
			System.out.println("Error in sql exception");
		}
		return isValid;
	}

	@Override
	public boolean addNewUser(UserInfo u) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
