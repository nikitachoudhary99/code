package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class AddProduct {
static String url="jdbc:mysql://localhost:3306/30apr25ad";
static String user="root";
static String password="mishthu99";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    } 
		catch (Exception e) {
		System.out.println("Error in loading Drivers");
		}
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stml=con.createStatement();
			int x = stml.executeUpdate("insert into product values (109,'mouse',500)");
			x = stml.executeUpdate("insert into product values (110,'keyboard',500)");
			x = stml.executeUpdate("insert into product values (111,'pandrive',600)");
			x = stml.executeUpdate("insert into product values (112,'cable',550)");
			x = stml.executeUpdate("insert into product values (113,'rowter',500)");
			
			System.out.println(x + "recorded inserted");
			

		} 
		catch (Exception e) {
						
			System.out.println("error in sql statement");
		}

	}

}
