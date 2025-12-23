package com.univ.daoimpl;

import com.univ.dao.AdminDao;
import com.univ.pojo.AdminInfo;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AdminDaoImpl implements AdminDao {

    private JdbcTemplate jTemplate;

    @Autowired
    public void setjTemplate(JdbcTemplate jTemplate) {
        this.jTemplate = jTemplate;
    }

    // --------- LOGIN CHECK ----------
    @Override
    public AdminInfo checkAdminCredential(AdminInfo a) {
        try {
            String sql = "SELECT * FROM admininfo WHERE username=? AND password=? AND role=?";
            return jTemplate.queryForObject(
                sql,
                new Object[]{a.getUsername(), a.getPassword(), a.getRole()},
                (ResultSet rs, int rowNum) -> {
                    AdminInfo admin = new AdminInfo();
                    admin.setUsername(rs.getString("username"));
                    admin.setPassword(rs.getString("password"));
                    admin.setRole(rs.getString("role"));
                    return admin;
                }
            );
        } catch (Exception e) {
            return null; // agar record nahi mila
        }
    }



    // --------- ADD NEW ADMIN ----------
    @Override
    public boolean addNewAdmin(AdminInfo a) {
        try {
            int count = jTemplate.update(
                "INSERT INTO userinfo(username, password, role) VALUES(?, ?, 'ADMIN')",
                a.getUsername(), a.getPassword()
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // --------- UPDATE PASSWORD ----------
    @Override
    public boolean updateAdminPassword(AdminInfo a) {
        try {
            int count = jTemplate.update(
                "UPDATE userinfo SET password=? WHERE username=? AND role='ADMIN'",
                a.getPassword(), a.getUsername()
            );
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
