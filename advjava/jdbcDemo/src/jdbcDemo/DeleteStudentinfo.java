package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudentinfo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) {
			System.out.println("Error in loading driver");
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:"
					+ "3306/30apr25ad?user=root&password=mishthu99");
			
			Statement stml=con.createStatement();
			int x=stml.executeUpdate("delete from studentinfo where id=4");
			System.out.println(x+"record deleted ");
			con.close();
			stml.close();
		   } 
		catch (Exception e) {
		  System.out.println("Error in sql statement"+e);
		}
	}

}
