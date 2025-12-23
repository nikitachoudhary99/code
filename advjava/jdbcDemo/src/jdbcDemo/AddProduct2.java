package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddProduct2 {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		   }
		
		 catch (Exception e) {
			System.out.println("Error found in loading Driver");
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306"
					+ "/30apr25ad?user=root&password=mishthu99");
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
			int pid;
			String pname;
			double price;
			int x=0;
			int n;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of product you need to add");
			n=sc.nextInt();
			for(int i=0;i<=n;i++)
			{
				System.out.println("Enter pid");
				pid=sc.nextInt();
				System.out.println("Enter p-Name");
				pname=sc.next();
				System.out.println("Enter price");
				price=sc.nextDouble();
				ps.setInt(1, pid);
				ps.setString(2, pname);
				ps.setDouble(3, price);
				x=x+ps.executeUpdate();
				
			}
			System.out.println(x+"record Inserted");
			con.close();
			ps.close();
		   } 
		
		catch (Exception e) {
			System.out.println("Error in sql statement");
		}

	}

}
