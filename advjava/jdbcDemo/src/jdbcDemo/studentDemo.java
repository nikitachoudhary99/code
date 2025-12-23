package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class studentDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  } 
		catch (Exception e) {
			System.out.println("error in loading drivers");	  
		}                                 
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			
			Statement stml=con.createStatement();
			int x=stml.executeUpdate("insert into studentInfo values(1,'nikita',101,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(2,'trapti',102,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(3,'hitesh',103,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(4,'aakanksha',104,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(5,'aayush',105,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(6,'shakti',106,8996512)");
			x=stml.executeUpdate("insert into studentInfo values(7,'yash',107,8996512)");
			System.out.println(x+"record inserted");
			con.close();
			stml.close();
		} 
		catch (Exception e) {
		System.out.println("error in sql Ststement");
		}

	}

}
