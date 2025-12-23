import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllProduct {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) 
		{
			System.out.println("Error in loading drivers");
		}
		
		try 
		{
			Connection con = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ "30apr25ad?user=root&password=root");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from product");
	
			while(rs.next())
			{
				System.out.println("P-Id = "+rs.getInt("pid"));
				System.out.println("P-Name = "+rs.getString("pname"));
				System.out.println("Price = "+rs.getDouble("price"));
			}
			
			con.close();
			stmt.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
