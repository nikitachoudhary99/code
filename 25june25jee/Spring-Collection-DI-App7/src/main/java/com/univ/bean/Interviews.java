package com.univ.bean;

import java.util.Map;

public class Interviews {

	private Map<String, String>schedule;

	public Interviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interviews(Map<String, String> schedule) {
		super();
		this.schedule = schedule;
	}

	public Map<String, String> getSchedule() {
		return schedule;
	}

	public void setSchedule(Map<String, String> schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "schedule = " + schedule + "\n";
	}
	
}
