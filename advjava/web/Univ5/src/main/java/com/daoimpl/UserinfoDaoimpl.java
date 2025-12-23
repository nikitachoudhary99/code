package com.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.Userinfodao;
import com.pojo.Userinfo;

public class UserinfoDaoimpl implements Userinfodao {

    Connection con = null;

    public UserinfoDaoimpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
        } catch (Exception e) {
            System.out.println("ERROR IN DRIVER MANAGER & MAKING CONNECTION");
            e.printStackTrace();
        }
    }

    @Override
    public boolean CheckuserCredential(Userinfo u) {
        boolean isValid = false;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userinfo WHERE username=? AND password=?");
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();
            isValid = rs.next(); // true if user exists
        } catch (Exception e) {
            System.out.println("Error checking user credentials.");
            e.printStackTrace();
        }
        return isValid;
    }

    @Override
    public boolean addNewUser(Userinfo u) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO userinfo(username, password) VALUES (?, ?)");
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error adding new user.");
            e.printStackTrace();
        }
        return false;
    }

    // ✅ Update user password (or any other field if needed)
    public boolean updateUser(Userinfo u) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE userinfo SET password=? WHERE username=?");
            ps.setString(1, u.getPassword());
            ps.setString(2, u.getUsername());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error updating user.");
            e.printStackTrace();
        }
        return false;
    }

    // ✅ Delete user
    public boolean deleteUser(String username) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM userinfo WHERE username=?");
            ps.setString(1, username);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error deleting user.");
            e.printStackTrace();
        }
        return false;
    }
}
