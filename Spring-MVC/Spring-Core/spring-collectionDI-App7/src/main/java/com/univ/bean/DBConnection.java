package com.univ.bean;

import java.util.Properties;

public class DBConnection {
 
	private Properties dbprop;

	public DBConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBConnection(Properties dbprop) {
		super();
		this.dbprop = dbprop;
	}

	public Properties getDbprop() {
		return dbprop;
	}

	public void setDbprop(Properties dbprop) {
		this.dbprop = dbprop;
	}

	@Override
	public String toString() {
		return "DBConnection" + dbprop+"\n";
	}
	
}
