package com.ak.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.ak.dao.userinfodao;
import com.ak.pojo.userinfo;

public class UserInfoDaoimpl implements userinfodao {
 
	Connection con;
	public UserInfoDaoimpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
		}
		catch (Exception e) {
			System.out.println("ERROR IN LOADING DRIVER & MAKING CONNECTION ");
		}
	}
	@Override
	public boolean checkUserCredential(userinfo u) {
	try {
		PreparedStatement ps=con.prepareStatement("select * from userinfo where username=? and password=?");
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		int x=ps.executeUpdate();
		if(x>0)
		{
			return true;
		}
		else
		{return false;}
	}
	catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	}
	@Override
	public boolean addNewUser(userinfo u) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into userinfo values(?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			int x = ps.executeUpdate();
			if(x>0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
