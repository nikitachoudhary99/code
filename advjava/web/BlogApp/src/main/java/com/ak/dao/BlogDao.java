package com.ak.dao;

import java.util.List;

import com.ak.pojo.Blog;

public interface BlogDao {
	
	    boolean add(Blog b);
	    Blog getById(int id);
	    List<Blog> getByUser(int userId);
	    boolean update(Blog b);
	    boolean delete(int id);
	    List<Blog> getAll();
	

}
