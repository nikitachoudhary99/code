package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class AddStudent {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception e) {
		  System.out.println("Error found in loading Driver"+e);
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
			PreparedStatement ps=con.prepareStatement("insert into studentinfo values (?,?,?,?)");
			int id;
			String name;
			int roll;
			int mob;
			int n,x=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of Student you need to add");
			n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				
				System.out.println("Enter id");
				id=sc.nextInt();
				System.out.println("Enter name");
				name=sc.next();
				System.out.println("Enter roll no");
				roll=sc.nextInt();
				System.out.println("Enter mob no");
				mob=sc.nextInt();
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setInt(3,roll);
				ps.setInt(4,mob);
				x=x+ps.executeUpdate();
				
			}
			System.out.println("record Inserted");
			con.close();
			ps.close();
			
		} 
		catch (Exception e) {
			System.out.println("Error found in sql Statement"+e);
		}

	}

}
