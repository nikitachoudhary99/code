package com.univ.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
 @Id
	private String bookName;
	private String authorName;
	private double Price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String authorName, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		Price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", Price=" + Price + "]";
	}
	
	
}
