package com.ak.daoimpl;

import java.sql.*;

import com.ak.dao.Userdao;

import com.ak.pojo.User;

public class UserDaoImpl implements Userdao {

	  private Connection con;

	    public UserDaoImpl() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blogmng", "root", "mishthu99");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

    @Override
    public boolean register(User u) {
        boolean success = false;
        try {
            String sql = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            int rows = ps.executeUpdate();
            success = rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean login(User u) {
        
        try {
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,u.getEmail());
            ps.setString(2,u.getPassword());

            ResultSet rs = ps.executeQuery(); 

            return rs.next();
        } 
           catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }

    @Override
    public boolean updateProfile(User u) {
        boolean success = false;
        try {
            String sql = "UPDATE users SET name=?, email=?, password=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setInt(4, u.getId());
            int updated = ps.executeUpdate();
            success = updated > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }
}
