package com.univ.repository;

import org.springframework.data.repository.CrudRepository;

import com.univ.pojo.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, String>{

}
