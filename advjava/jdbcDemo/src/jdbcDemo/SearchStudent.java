package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch (Exception e) {
			System.out.println("Error found in loading driver "+e);
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost"
					+ ":3306/30apr25ad?user=root&password=mishthu99");
		    Statement stml=con.createStatement();
		    ResultSet rs=stml.executeQuery("Select * from studentinfo where id= 10");
		    if(rs.next()==true)
		    {
		    	System.out.println("p-id="+rs.getInt("id"));
		    	System.out.println("pname="+rs.getString("name"));
		    	System.out.println("price="+rs.getInt("roll"));
		    	System.out.println("price="+rs.getInt("mob"));
		    }
		    else
		    {
		    	System.out.println("record not found");
		    	con.close();
		    	stml.close();
		    }
		} 
		catch (Exception e) {
			System.out.println("Error found in sql statement "+e);
		}

	}

}
