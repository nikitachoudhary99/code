import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddProduct {

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
					+ "//localhost:3306/30apr25ad?user=root&password=mishthu99");
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate("insert into product "
					+ "values(101,'Printer',12000)");
			x = x + stmt.executeUpdate("insert into product "
					+ "values(102,'Monitor',3250)");
			x = x + stmt.executeUpdate("insert into product "
					+ "values(103,'Mic',2550)");
			x = x + stmt.executeUpdate("insert into product "
					+ "values(104,'Mouse',350)");
			x = x + stmt.executeUpdate("insert into product "
					+ "values(105,'Keyboard',550)");
			
			System.out.println(x+" record insereted");
			con.close();
			stmt.close();
		}
		catch (SQLException e) 
		{
			System.out.println("Error in sql statement");
		}
	}

}
