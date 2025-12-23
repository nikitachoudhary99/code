package com.blog.daoimpl;

import java.sql.*;
import com.blog.dao.UserDao;
import com.blog.pojo.User;

public class UserDaoImpl implements UserDao {
	
    public boolean registerUser(User user) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO user (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User login(String email, String password) {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "SELECT * FROM user WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

	public User LoginUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
