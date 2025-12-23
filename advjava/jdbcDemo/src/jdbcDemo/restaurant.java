package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class restaurant {

	public static void main(String[] args) {
		
	try {
		   Class.forName("com.mysql.cj.jdbc.Driver");	
		} 
	catch (Exception e) {
		System.out.println("error in loading driver");	
		}
  
	try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?"
		  		+ "user=root&password=mishthu99");
		  Statement stml=con.createStatement();
		  int r=stml.executeUpdate("insert into restaurant value(1,'hitesh',45869622)");
		      r=stml.executeUpdate("insert into restaurant value(2,'heet',45869622)");
		      r=stml.executeUpdate("insert into restaurant value(3,'radhe',45869622)");
		      r=stml.executeUpdate("insert into restaurant value(4,'shyam',45869622)");
		      r=stml.executeUpdate("insert into restaurant value(5,'ram',45869622)");
		      r=stml.executeUpdate("insert into restaurant value(6,'siya',45869622)");
		      System.out.println("value successfully inserted ");
		      System.out.println("booking conform");
		      con.close();
		      stml.close();
	    } 
	catch (Exception e) {
		 System.out.println("Error found in sql statement");
	}
	
	}

}
