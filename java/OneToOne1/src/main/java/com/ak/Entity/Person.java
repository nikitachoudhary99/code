package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
@Table(name="person")
	public class Person {
    @Id

	private int Id;
	private String Name;
	
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(int id, String name) {
			super();
			Id = id;
			Name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		@Override
		public String toString() {
			return  Id + "\t" + Name ;
		}

}
