package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) {
		 System.out.println("Error found in loading Driver");
		}
		try {
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			 Statement stml=con.createStatement();
			 ResultSet rs=stml.executeQuery("select * from studentinfo");
			 while(rs.next()==true)
			 {
				 System.out.println("id="+rs.getInt("id"));
				 System.out.println("name="+rs.getString("name"));
				 System.out.println("roll="+rs.getInt("roll"));
				 System.out.println("mob="+rs.getInt("mob"));
				 
			 }
			 con.close();
			 stml.close();
		}	
		catch (Exception e) {
			System.out.println("Error found in sql Statement"+e);
		}

	}

}
