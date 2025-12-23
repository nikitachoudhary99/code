import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteProduct2 {

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
			Connection con = DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/30apr25ad?user=root&password=root");
		
			PreparedStatement ps = 
			con.prepareStatement("delete from product where pid = ?");
			
			int pid;
			int x=0;
			Scanner s = new Scanner(System.in);
				System.out.println("Enter P-Id :");
				pid = s.nextInt();
			
				ps.setInt(1, pid);
				x =x+ ps.executeUpdate();
			
				
			System.out.println(x+" record deleted");
			con.close();
			ps.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
