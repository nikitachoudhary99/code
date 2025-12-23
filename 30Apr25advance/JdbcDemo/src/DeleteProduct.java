import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProduct {

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
			
			int x = stmt.executeUpdate("delete from product "
						+ "where pid = 105");
			
			
			System.out.println(x+" record deleted");
			con.close();
			stmt.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
