import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddProduct2 {

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
					con.prepareStatement("insert into product "
				+"values(?,?,?)");
			
			int pid;
			String pname;
			double price;
			int x=0;
			Scanner s = new Scanner(System.in);
			for(int i=1; i<=3; i++)
			{
				System.out.println("Enter P-Id :");
				pid = s.nextInt();
				System.out.println("Enter P-Name :");
				pname = s.next();
				System.out.println("Enter price :");
				price = s.nextDouble();
				ps.setInt(1, pid);
				ps.setString(2, pname);
				ps.setDouble(3, price);
				x =x+ ps.executeUpdate();
			}
				
			System.out.println(x+" record insereted");
			con.close();
			ps.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
