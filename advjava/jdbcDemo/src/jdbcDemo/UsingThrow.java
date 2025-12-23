package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UsingThrow {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
	
	System.out.println("conected");
	PreparedStatement ps=con.prepareStatement("insert into product values(125,'tab',25000)");
	
	int i=ps.executeUpdate();  	
	if(i>0)
	{
	System.out.println("inserted");	
	}
	else
	{
	System.out.println("not inserted");
	}
	con.close();
	ps.close();
	}
}


