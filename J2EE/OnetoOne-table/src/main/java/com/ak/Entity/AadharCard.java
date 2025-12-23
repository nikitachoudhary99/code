package com.ak.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Aadhar")
public class AadharCard {
	@Id
	    private int id;
	    private String aadharNumber;
	    private String issueDate;
	    
		public AadharCard() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AadharCard(int id, String aadharNumber, String issueDate) {
			super();
			this.id = id;
			this.aadharNumber = aadharNumber;
			this.issueDate = issueDate;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAadharNumber() {
			return aadharNumber;
		}
		public void setAadharNumber(String aadharNumber) {
			this.aadharNumber = aadharNumber;
		}
		public String getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(String issueDate) {
			this.issueDate = issueDate;
		}
		@Override
		public String toString() {
			return id + "\t" + aadharNumber + "\t" + issueDate;
		}
	    
}
