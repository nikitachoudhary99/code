package com.dao;

import com.pojo.Userinfo;

public interface Userinfodao {
    boolean CheckuserCredential(Userinfo u);
    boolean addNewUser(Userinfo u);
}
