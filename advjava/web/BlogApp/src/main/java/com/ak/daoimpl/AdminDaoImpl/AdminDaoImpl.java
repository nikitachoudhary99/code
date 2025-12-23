package com.ak.daoimpl.AdminDaoImpl;


import com.ak.dao.AdminDao.AdminDao;
import com.ak.pojo.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao {
    private Connection con;

    public AdminDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blogmng", "root", "mishthu99");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean login(String email, String password) {
        boolean isAdmin = false;
        try {
            String sql = "SELECT * FROM users WHERE email=? AND password=? AND role='admin'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            isAdmin = rs.next(); // true if admin record exists
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdmin;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM users";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                list.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean success = false;
        try {
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            success = rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }
}
