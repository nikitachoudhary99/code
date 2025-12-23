package com.univ.dao;

import com.univ.pojo.AdminInfo;

public interface AdminDao {
    AdminInfo checkAdminCredential(AdminInfo a);
    boolean addNewAdmin(AdminInfo a);
    boolean updateAdminPassword(AdminInfo a);
}
