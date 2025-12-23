package com.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.ProductDao;
import com.pojo.Product;

public class ProductDaoImpl implements ProductDao{
	Connection con;
	public ProductDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(Product p) {
		try {
			String sql = "INSERT INTO product (pid, pname, price) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, p.getPid());
	        ps.setString(2, p.getPname());
	        ps.setDouble(3, p.getPrice());

	        int rows = ps.executeUpdate();
	        if (rows > 0) {
	            return true;
	        } 
	        ps.close();
	        con.close();
	       
	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
		 return false;
	}
	
}
