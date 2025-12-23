package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateProduct {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) {
		System.out.println("Error found in loading driver"+e);	
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			Statement stml=con.createStatement();
			int x=stml.executeUpdate("update product set pname='mouse-i-ball',price=600 where pid=105");
			System.out.println("record updated");
			con.close();
			stml.close();
		} catch (Exception e) {
			System.out.println("Error found in sql Statement"+e);
		}

	}

}
