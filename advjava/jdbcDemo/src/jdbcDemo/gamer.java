package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class gamer {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  } 
		catch (Exception e) {
			System.out.println("Error in loading Driver");
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			
			Statement stml=con.createStatement();
			int g=stml.executeUpdate("insert into gamer value(1,'aakanksha',4852565,'indore')");
			    g=stml.executeUpdate("insert into gamer value(2,'keshav',42565565,'betuva')");
			    g=stml.executeUpdate("insert into gamer value(3,'shivam',1234565,'bhopal')");
			    g=stml.executeUpdate("insert into gamer value(4,'vishal',7895565,'dhar')");
				g=stml.executeUpdate("insert into gamer value(5,'aashay',98765565,'indore')");
			System.out.println("value inserted");
			con.close();
			stml.close();
		} 
		catch (Exception e) {
		 System.out.println("Error in sql statement please cheack");	
		}
	
	}

}
