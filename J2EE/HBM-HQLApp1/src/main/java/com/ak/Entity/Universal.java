package com.ak.Entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="univrsal")
public class Universal {
	@Id
    private int fId;
	private int faculty;
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String sId;
	private String sub;
	private String student;
	private int fee;
	private double time;
	public Universal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Universal(int fId, int faculty, String sId, String sub, String student, int fee, double time) {
		super();
		this.fId = fId;
		this.faculty = faculty;
		this.sId = sId;
		this.sub = sub;
		this.student = student;
		this.fee = fee;
		this.time = time;
	}
	public Universal(int faculty, String sub, String student, int fee, double time) {
		super();
		this.faculty = faculty;
		this.sub = sub;
		this.student = student;
		this.fee = fee;
		this.time = time;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getFaculty() {
		return faculty;
	}
	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Universal [fId=" + fId + ", faculty=" + faculty + ", sId=" + sId + ", sub=" + sub + ", student="
				+ student + ", fee=" + fee + ", time=" + time + "]";
	}
	
	
}
