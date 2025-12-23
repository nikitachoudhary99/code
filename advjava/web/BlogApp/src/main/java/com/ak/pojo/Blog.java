package com.ak.pojo;

public class Blog {
	  private int id, userId;
	    private String title, content;
		public Blog() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Blog(int id, int userId, String title, String content) {
			super();
			this.id = id;
			this.userId = userId;
			this.title = title;
			this.content = content;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
}
