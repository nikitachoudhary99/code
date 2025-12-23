package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllProduct {

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
			 ResultSet rs=stml.executeQuery("select * from product");
			 while(rs.next()==true)
			 {
				 System.out.println("pid="+rs.getInt("pid"));
				 System.out.println("pname="+rs.getString("pname"));
				 System.out.println("price="+rs.getDouble("price"));
				 
			 }
			 con.close();
			 stml.close();
		}	
		catch (Exception e) {
			System.out.println("Error found in sql Statement"+e);
		}

	}

}
