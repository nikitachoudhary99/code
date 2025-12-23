package com.blog.pojo;

public class Blog {

	  private int id;
	    private String title;
	    private String content;
	    private int userId;
		public Blog() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Blog(int id, String title, String content, int userId) {
			super();
			this.id = id;
			this.title = title;
			this.content = content;
			this.userId = userId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}

	    

}
