package com.univ.bean;

import java.util.Map;

public class Interviews {
private Map<String, String>schedul;

public Interviews() {
	super();
	// TODO Auto-generated constructor stub
}

public Interviews(Map<String, String> schedul) {
	super();
	this.schedul = schedul;
}

public Map<String, String> getSchedul() {
	return schedul;
}

public void setSchedul(Map<String, String> schedul) {
	this.schedul = schedul;
}

@Override
public String toString() {
	return "Interviews " + schedul;
}


}
