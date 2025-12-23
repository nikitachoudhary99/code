import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchProduct2 {

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
			PreparedStatement ps = 
			con.prepareStatement("select * from product where pid = ?");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter p-id :");
			int pid = s.nextInt();
			ps.setInt(1, pid);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				System.out.println("P-Id = "+rs.getInt("pid"));
				System.out.println("P-Name = "+rs.getString("pname"));
				System.out.println("Price = "+rs.getDouble("price"));
			}
			else
				System.out.println("Record Not Found");
			con.close();
			ps.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
