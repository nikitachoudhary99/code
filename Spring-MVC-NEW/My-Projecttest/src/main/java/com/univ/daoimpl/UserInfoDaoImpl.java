package com.univ.daoimpl;

import com.univ.dao.UserInfoDao;
import com.univ.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

    @Autowired
    private JdbcTemplate jTemplate;

    // ---------- LOGIN (CHECK CREDENTIAL) ----------
    @Override
    public UserInfo checkUserCredential(UserInfo u) {
        try {
            String sql = "SELECT * FROM userinfo WHERE username=? AND password=? AND role=?";
            return jTemplate.queryForObject(
                sql,
                new Object[]{u.getUsername(), u.getPassword(), u.getRole()},
                (ResultSet rs, int rowNum) -> {
                    UserInfo user = new UserInfo();
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    return user;
                }
            );
        } catch (Exception e) {
            return null; // agar record nahi mila
        }
    }

    // ---------- ADD USER / ADMIN ----------
    @Override
    public boolean addNewUser(UserInfo u) {
        try {
            int count = jTemplate.update(
                "INSERT INTO userinfo(username, password, role) VALUES(?, ?, ?)",
                u.getUsername(), u.getPassword(), u.getRole()
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ---------- ADD NEW PASSWORD ----------
    @Override
    public boolean addNewPassword(UserInfo u) {
        try {
            int count = jTemplate.update(
                "UPDATE userinfo SET password=? WHERE username=? AND role=?",
                u.getPassword(), u.getUsername(), u.getRole()
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ---------- UPDATE PASSWORD ----------
    @Override
    public boolean updatepassword(UserInfo u) {
        try {
            int count = jTemplate.update(
                "UPDATE userinfo SET password=? WHERE username=? AND role=?",
                u.getPassword(), u.getUsername(), u.getRole()
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
