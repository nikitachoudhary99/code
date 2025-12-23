import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddProduct {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbs.Driver");	
		} catch (Exception e) {
			System.out.println("Error in loading Drivers and connection");
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishth99");
			Statement stml= con.createStatement();
			
			int x=stml.executeUpdate("insert into product values(101,'moniter',120)");
			x=stml.executeUpdate("insert into product values(102,'iball',120)");
		} catch (Exception e) {
		System.out.println("Error in sql Statement");
		}
		

	}

}
