package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class employee {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) {
	  System.out.println("error in loading Drivers");
		}
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			Statement stml= con.createStatement();
			int x=stml.executeUpdate("insert into employee value(1,'aayush',50000)");
			x=stml.executeUpdate("insert into employee value(2,'hitesh',510000)");
			x=stml.executeUpdate("insert into employee value(3,'shakti',55000)");
			x=stml.executeUpdate("insert into employee value(4,'aakanksha',520000)");
			x=stml.executeUpdate("insert into employee value(5,'keshav',45000)");
			System.out.println("value inserted");
			con.close();
			stml.close();
		} 
		catch (Exception e) {
			System.out.println("error in sql statement");
		}

	}

}
