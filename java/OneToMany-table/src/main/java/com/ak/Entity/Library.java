package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {
	@Id
	private int id;
	private String bookName;
	private int Price;

	

}
