package com.blog.dao;

import java.util.List;

import com.blog.pojo.Blog;

public interface BlogDao {
	
	  boolean addBlog(Blog blog);
	  List<Blog> getAllBlogs();
}
