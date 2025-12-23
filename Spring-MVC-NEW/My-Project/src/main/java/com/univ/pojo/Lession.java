package com.univ.pojo;

public class Lession {
    private int id;
    private String courseId;
    private String Content;
	public Lession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lession(int id, String courseId, String content) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.Content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		this.Content = content;
	}
    
    
    
}
